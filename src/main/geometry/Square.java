package main.geometry;

public class Square extends Tetragon{
	public Square(String name, Point p1, int length) {
		super(name);
		
		constructMe(p1, length);
	}

	protected void constructMe(Point p1, int length) {
		int x = p1.getX();
		int y = p1.getY();
		
		Point p2 = new Point("a", x, y+length);
		Point p3 = new Point("a", x+length, y+length);
		Point p4 = new Point("a", x+length, y);
		
		super.setPoints(p1, p2, p3, p4);
	}
	
	public double getFlaeche() {
		double a = getP1().calcDistance(getP2());
		return a*a;
	}
	
	@Override
	public double calcUmfang() {
		double a = getP1().calcDistance(getP2());
		return a*4;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
