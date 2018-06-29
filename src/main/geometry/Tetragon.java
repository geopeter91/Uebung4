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
		double a = getP1().calcDistance(getP2());
		double b = getP2().calcDistance(getP3());
		double c = getP3().calcDistance(getP4());
		double d = getP4().calcDistance(getP1());
		
		return a+b+c+d;
	}
	
	public boolean isValid() {
		double angleA = determineAngle(getP4(), getP2(), getP1());
		double angleB = determineAngle(getP1(), getP3(), getP2());
		double angleC = determineAngle(getP2(), getP4(), getP3());
		double angleD = determineAngle(getP1(), getP3(), getP4());
				
		double angelSum = angleA + angleB + angleC + angleD;
		return angelSum >= 359 && angelSum <= 361;
	}
	
	@Override
	public String toString() {
		String val = super.toString();
		val += "\nUmfang: "+calcUmfang();
		return val;
	}
}