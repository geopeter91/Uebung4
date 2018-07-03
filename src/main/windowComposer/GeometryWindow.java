package main.windowComposer;

import java.awt.Graphics;

import main.geometry.Geometry;
import main.geometry.Rectangle;
import main.geometry.Square;
import main.model.GeometryModel;

public class GeometryWindow{

	private static final long serialVersionUID = 1L;
	
	private GeometryModel model;
	
	public GeometryWindow(GeometryModel model) {
		this.model = model;
	}

	public void loop(Graphics graphics) {
		drawPoi(graphics);
		drawGeometry(model.getRectangle(),graphics);
		drawGeometry(model.getSquare(),graphics);
		drawGeometry(model.getTetragon(),graphics);
	}

	private void drawPoi(Graphics graphics) {
		graphics.drawOval(model.getPoi().getX(),model.getPoi().getY(),4,4);
	}

	private void drawGeometry(Geometry geo, Graphics graphics) {
		int x = geo.getP2().getX();
		int y = geo.getP2().getY();
		int[] xRect = {geo.getP1().getX(), geo.getP2().getX(), geo.getP3().getX(), geo.getP4().getX()};
		int[] yRect = {geo.getP1().getY(), geo.getP2().getY(), geo.getP3().getY(), geo.getP4().getY()};
		
		drawPolygon(graphics, xRect, yRect);
	}

	private void drawPolygon(Graphics graphics, int[] xRect, int[] yRect) {
		graphics.drawPolygon(xRect, yRect, yRect.length);
	}

	
	


	
}
