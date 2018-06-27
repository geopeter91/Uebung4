package main.geometry;

public class Tetragon extends Geometry{

	public Tetragon(String name) {
		super(name);
	}
	
	public Tetragon(String name, Point p1, Point p2, Point p3, Point p4) {
		// TODO Auto-generated constructor stub
		super(name);
		setPoints(p1, p2, p3, p4);
	}

	public double calcUmfang() {
		double a = p1.calcDistance(p2);
		double b = p2.calcDistance(p3);
		double c = p3.calcDistance(p4);
		double d = p4.calcDistance(p1);
		
		System.out.println("Distanz a: "+a);
		
		return a+b+c+d;
	}
	
	public boolean isValid() {
		boolean valid = false;
		
		double angleB = determineAngle(p1, p2, p3);
		double angleC = determineAngle(p2, p3, p4);
		double angleD = determineAngle(p3, p4, p1);
		double angleA = determineAngle(p4, p1, p2);
		
		double angelSum = angleA + angleB + angleC + angleD;
		
		return angelSum >= 359 || angelSum <= 361;
	}
	
	@Override
	public String toString() {
		String val = super.toString();
		val += "\nUmfang: "+calcUmfang();
		return val;
	}
}