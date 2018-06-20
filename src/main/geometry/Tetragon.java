package main.geometry;

public class Tetragon extends Geometry{

	public Tetragon(String name) {
		super(name);
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
		
		double angelB = determineAngel(p1, p2, p3);
		double angelC = determineAngel(p2, p3, p4);
		double angelD = determineAngel(p3, p4, p1);
		double angelA = determineAngel(p4, p1, p2);
		
		double angelSum = angelA + angelB + angelC + angelD;
		
		return angelSum >= 359 || angelSum <= 361;
	}
	
	@Override
	public String toString() {
		String val = super.toString();
		val += "\nUmfang: "+calcUmfang();
		return val;
	}
}