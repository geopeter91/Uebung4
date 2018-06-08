package main.geometry;

public class Point {
	
	private String name = "";
	private int x = 0;
	private int y = 0;
	
	public Point(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double calcDistance(Point b) {
		double x2 = (Math.abs(b.getX()) - Math.abs(x))^2;
		double y2 = (Math.abs(b.getY()) - Math.abs(y))^2;
		return Math.sqrt(x2 + y2);
	}
	
	@Override
	public String toString() {
		return "Point "+name+"("+x+","+y+")";
	}
	
	
	
	
}
