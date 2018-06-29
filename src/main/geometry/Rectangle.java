package main.geometry;

public class Rectangle extends Geometry{

	/*
	 * Input 
	 * p1 linkere untere Ecke
	 * p3 rechte obere Ecke
	 * 
	 */
	public Rectangle(String name, Point p1, Point p3) {
		super(name);
		
		constructMe(p1, p3);
	}
	
	
	private void constructMe(Point p1, Point p3) {
		int x = p1.getX();
		int y = p3.getY();
		Point p2 = new Point(getName()+"_P2", x, y);
		
		x = p3.getX();
		y = p1.getY();
		Point p4 = new Point(getName()+"_P2", x, y);
		
		super.setPoints(p1, p2, p3, p4);
	}
	
	public boolean isInside(Point checkPoint) {
		boolean checkX = checkPoint.getX() > getP1().getX() && checkPoint.getX() < getP3().getX();
		boolean checkY = checkPoint.getY() > getP1().getY() && checkPoint.getY() < getP3().getY();
		
		return checkX && checkY;
	}
	
	public boolean isInside(Square checkSquare) {
		
		boolean isP1Inside = isInside(checkSquare.getP1());
		boolean isP2Inside = isInside(checkSquare.getP2());
		boolean isP3Inside = isInside(checkSquare.getP3());
		boolean isP4Inside = isInside(checkSquare.getP4());
		return isP1Inside && isP2Inside && isP3Inside && isP4Inside;
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
		
}
