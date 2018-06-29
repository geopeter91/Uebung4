package main.geometry;

public class GeometryTest {

	public static void main(String[] args) {
		//testDetermineVector();
		testDetermineAngle();
		testBogenToGrad();
		testDetermineAngleII();
		
		//testDetermineAngelA();
	}
	
	public static void testBogenToGrad() {
		System.out.println("testBogenToGrad");
		double bogen1 = 2;
		Geometry geo = getClassUnderTest();
		double antwort = geo.radToGrad(bogen1); 	
		
		if(antwort==90) {
			System.out.println("GREEN: "+bogen1+" --> "+antwort);
		}else{
			System.out.println("RED: "+bogen1+" --> "+antwort);
		}
		
		bogen1 = 1;
		antwort = geo.radToGrad(bogen1);
		if(antwort==45) {
			System.out.println("GREEN: "+bogen1+" --> "+antwort);
		}else{
			System.out.println("RED: "+bogen1+" --> "+antwort);
		}
		
		bogen1 = 1.5708;
		antwort = geo.radToGrad(bogen1);
		if(antwort>=90 && antwort<=90.5) {
			System.out.println("GREEN: "+bogen1+" --> "+antwort);
		}else{
			System.out.println("RED: "+bogen1+" --> "+antwort);
		}
		
	}
	
	public static void testDetermineVector() {
		Geometry geo = getClassUnderTest();
		
		Point a = new Point("p1",3,9);
		Point b = new Point("p2",1,3);
		
		Point vec = geo.determineVector(a, b);
		System.out.println(vec);	
	}
	
	public static void testDetermineAngle() {
		System.out.println("testDetermineAngle");
		Geometry geo = getClassUnderTest();
		
		Point a = new Point("P1",0,0);
		Point b = new Point("P2",0,2);
		Point c = new Point("P3",2,2);
		
		double angleA = geo.determineAngle(a, c, b); //b, c, a
		
		if(angleA == 90) {
			System.out.println("GREEN: testDetermineAngel: "+angleA);
		} else {
			System.out.println("RED: testDetermineAngel: "+angleA);
		}
	}
		
	public static void testDetermineAngleII() {
		System.out.println("testDetermineAngleII");
		Geometry geo = getClassUnderTest();
		
		Point a = new Point("P1",0,0);
		Point b = new Point("P2S",0,2);
		Point c = new Point("P3",2,2);
		
		double angleP2S = geo.determineAngle(a, b, c);
				
		if(angleP2S >= 44.5 && angleP2S <= 45.5) {
			System.out.println("GREEN: testDetermineAngel: "+angleP2S);
		} else {
			System.out.println("RED: testDetermineAngel: "+angleP2S);
		}
	}
	
	private static Geometry getClassUnderTest() {
		Geometry cut = new Geometry("test");
		
		Point p1 = new Point("P1",0,0);
		Point p2 = new Point("P2",0,2);
		Point p3 = new Point("P3",2,2);
		Point p4 = new Point("P4",2,0);
		
		cut.setPoints(p1, p2, p3, p4);
		
		return cut;
	}
	
}
