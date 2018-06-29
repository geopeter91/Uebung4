package main;

import main.geometry.Point;
import main.geometry.Rectangle;
import main.geometry.Square;
import main.geometry.Tetragon;
import main.model.U4Model;
import main.windowComposer.U4Window;

public class Main {
	
	
	private U4Model model = new U4Model();
	private U4Window window;
	
	
	public static void main(String[] args) {
		new Main();
	}	
		
	public Main() {
		buildFigure();
		buildGUI();
	}
	
	public void buildFigure() {
		buildPoints();
		buildTetragon();
		buildRectangle();
		buildSquare();
	}

	private void buildPoints() {
		System.out.println(">> Teil 1 Points <<");
		Point poi = new Point("p1", 0, 0);
		Point p2 = new Point("p2", 4, 1);
		
		p2.setX(6);
		
		System.out.println(poi + " -- " + p2);
		System.out.println("check distance: "+poi.calcDistance(p2));
		
		model.setPoi(poi);
	}

	protected void buildTetragon() {
		System.out.println(">> Teil 2 Tetragon <<");
		Point p1 = new Point("P1",0,0);
		Point p2 = new Point("P2",0,2);
		Point p3 = new Point("P3",2,2);
		Point p4 = new Point("P4",2,0);
		
		Tetragon tetra1 = new Tetragon("TetraPack", p1, p2, p3, p4);
		System.out.println(tetra1);
		System.out.println("isValid: "+tetra1.isValid());
		
		model.setTetragon(tetra1);
	}	

	protected void buildSquare() {
		System.out.println(">> Teil 3 Square <<");
		Square square = new Square("square",new Point("sp1", 4, 1),5);
		System.out.println(square);
		System.out.println("Fläche: "+square.getFlaeche());
		
		model.setSquare(square);
	}
	
	protected void buildRectangle() {
		System.out.println(">> Teil 3 Rectangle <<");
		Point p1 = new Point("P1",1,1);
		Point p3 = new Point("P3",6,4);
		Rectangle rectangle = new Rectangle("rect1", p1, p3);
		
		System.out.println(rectangle);
		
		Point checkPointInside = new Point("cp1", 2, 2);
		Point checkPointOutside = new Point("cp2", 0, 0);
		
		System.out.println(checkPointInside+" liegt drin: "+rectangle.isInside(checkPointInside));
		System.out.println(checkPointOutside+" liegt drin: "+rectangle.isInside(checkPointOutside));
		
		System.out.println(checkPointInside+" liegt drin: "+rectangle.isInside(checkPointInside));
		System.out.println(checkPointOutside+" liegt drin: "+rectangle.isInside(checkPointOutside));
		
		model.setRectangle(rectangle);
	}
	
	protected void buildGUI() {
		window = new U4Window(model);
		window.build();
		
	}

}
