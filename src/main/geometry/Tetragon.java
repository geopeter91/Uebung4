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
		
		return a+b+c+d;
	}
	
	@Override
	public String toString() {
		String val = super.toString();
		val += "\nUmfang: "+calcUmfang();
		return val;
	}
}