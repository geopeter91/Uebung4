package main.geometry;

public class GeometryTest {

	public static void main(String[] args) {
		testDetermineVector();
		testDetermineAngel();
		testDetermineAngelA();
	}
	
	
	public static void testDetermineVector() {
		Geometry geo = getClassUnderTest();
		
		Point a = new Point("p1",3,9);
		Point b = new Point("p2",1,3);
		
		Point vec = geo.determineVector(a, b);
		System.out.println(vec);	
	}
	
	public static void testDetermineAngel() {
		Geometry geo = getClassUnderTest();
		
		Point a = new Point("P1",0,0);
		Point b = new Point("P2",0,2);
		Point c = new Point("P3",2,2);
		
		double angelA = geo.determineAngel(a, b, c);
		
		if(angelA == 90) {
			System.out.println("GREEN: testDetermineAngel");
		} else {
			System.out.println("RED: testDetermineAngel");
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
