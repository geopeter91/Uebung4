package main.geometry;

public class Geometry {
	
	protected String name = "";
	protected Point p1 = null;
	protected Point p2 = null;
	protected Point p3 = null;
	protected Point p4 = null;
	
	public Geometry(String name) {
		this.name = name;		
	}
	
	public void setPoints(Point p1, Point p2, Point p3, Point p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	public Point getP4() {
		return p4;
	}
	public void setP4(Point p4) {
		this.p4 = p4;
	}

	@Override
	public String toString() {
		String val = "___Geometry "+name+"___";
		val += "\nP1: "+p1;
		val += "\nP2: "+p2;
		val += "\nP3: "+p3;
		val += "\nP4: "+p4;
		
		return val;
	}
	
}
