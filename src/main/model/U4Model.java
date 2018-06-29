package main.model;

import main.geometry.Point;
import main.geometry.Rectangle;
import main.geometry.Square;
import main.geometry.Tetragon;

public class U4Model {

	private Point poi;
	private Rectangle rectangle; 
	private Square square;
	private Tetragon tetragon;
	
	public Point getPoi() {
		return poi;
	}
	public void setPoi(Point poi) {
		this.poi = poi;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public Square getSquare() {
		return square;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
	public Tetragon getTetragon() {
		return tetragon;
	}
	public void setTetragon(Tetragon tetra1) {
		this.tetragon = tetra1;
	}
	
}
