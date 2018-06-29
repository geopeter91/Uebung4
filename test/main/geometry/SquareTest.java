package main.geometry;

public class SquareTest {
	public static void main(String[] args) {
		testConstructMe();
		testCalcUmfang();
	}
	
	public static void testConstructMe() {
		Square square = getClassUnderTest();
		
		if(square.getP3().getX()==11 && square.getP3().getY()==11) {
			System.out.println("GREEN Square ist square");
		}else {
			System.out.println("RED square ist nicht square");
		}
	}
	
	public static void testCalcUmfang() {
		Square square = getClassUnderTest();
		double umfang = square.calcUmfang();
		if(umfang == 40) {
			System.out.println("GREEN umfang == "+umfang);
		}else {
			System.out.println("RED umfang 40!="+umfang);
		}
	}
	
	private static Square getClassUnderTest() {
		Point p1 = new Point("P1",1,1);
		int length = 10;
		Square cut = new Square("rect1", p1, length);
		return cut;
	}
	
}
