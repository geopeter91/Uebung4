package main.geometry;

public class RectangleTest {
	public static void main(String[] args) {
		testConstructMe();
		testPointIsInside();
		testSquareIsInside();
	}
	

	public static void testConstructMe() {
		
		Point p1 = new Point("P1",1,1);
		Point p3 = new Point("P3",6,4);
		Rectangle rectangle = new Rectangle("rect1", p1, p3);
		
		if(rectangle.getP2().getX() == p1.getX() && rectangle.getP2().getY() == p3.getY() && rectangle.getP4().getX() == p3.getX() && rectangle.getP4().getY() == p1.getY()) {
			System.out.println("GREEN Rectangle stimmt");
		}else {
			System.out.println("RED Rectangle ist falsch");
		}
	}
	
	public static void testPointIsInside() {
		Rectangle rect = getClassUnderTest();
		
		Point checkPoint = new Point("isInside",3,3);
		
		boolean isInside = rect.isInside(checkPoint);
		if(isInside) {
			System.out.println("GREEN Punkt: "+checkPoint+" ist drin");
		}else {
			System.out.println("RED "+checkPoint+" ist nicht drin");
		}
				
		checkPoint = new Point("isOutside",7,7);
		
		isInside = rect.isInside(checkPoint);
		if(!isInside) {
			System.out.println("GREEN Punkt: "+checkPoint+" liegt nicht drin");
		}else {
			System.out.println("RED Punkt: "+checkPoint+" ist nicht drin");
		}
		
		checkPoint = new Point("isOutside",0,0);
		
		isInside = rect.isInside(checkPoint);
		if(!isInside) {
			System.out.println("GREEN Punkt: "+checkPoint+" liegt nicht drin");
		}else {
			System.out.println("RED Punkt: "+checkPoint+" ist nicht drin");
		}
		
		checkPoint = new Point("isOnline",3,1);
		
		isInside = rect.isInside(checkPoint);
		if(!isInside) {
			System.out.println("GREEN Punkt: "+checkPoint+" liegt drin");
		}else {
			System.out.println("RED Punkt: "+checkPoint+" ist nicht drin");
		}
		
	}
	
	public static void testSquareIsInside() {
		Rectangle rect = getClassUnderTest();
		Point p1 = new Point("p1", 2, 2);
		int length = 1;
		Square testSquare = new Square("isInside", p1, length);
		
		boolean isInside = rect.isInside(testSquare);
		if(isInside) {
			System.out.println("GREEN Square: "+testSquare.getName()+" liegt drin");
		}else {
			System.out.println("RED Square: "+testSquare.getName()+" ist nicht drin");
		}
		
		p1 = new Point("p1", 1, 1);
		length = 1;
		testSquare = new Square("isOnline", p1, length);
		
		isInside = rect.isInside(testSquare);
		if(!isInside) {
			System.out.println("GREEN Square: "+testSquare.getName()+" liegt nicht drin");
		}else {
			System.out.println("RED Square: "+testSquare.getName()+" ist drin");
		}
		
		
		p1 = new Point("p1", 11, 11);
		length = 3;
		testSquare = new Square("isOutside", p1, length);
		
		isInside = rect.isInside(testSquare);
		if(!isInside) {
			System.out.println("GREEN Square: "+testSquare.getName()+" liegt nicht drin");
		}else {
			System.out.println("RED Square: "+testSquare.getName()+" ist drin");
		}
		
	}

	private static Rectangle getClassUnderTest() {
		Point p1 = new Point("P1",1,1);
		Point p3 = new Point("P3",6,4);
		Rectangle rectangle = new Rectangle("rect1", p1, p3);
		return rectangle;
	}
	
}
