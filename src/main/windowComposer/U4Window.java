package main.windowComposer;

import javax.swing.JFrame;
import main.geometry.Point;
import main.geometry.Square;
import main.model.U4Model;

public class U4Window {

	private U4Model model;
	private JFrame frame;
	
	public U4Window(U4Model model) {
		this.model = model;
	}

	public void build() {
		frame = new JFrame("Übung 4 - Graphics");
		
		addPoint();
		addSquare();
				
		frame.pack();
        frame.setVisible(true);
	}

	private void addSquare() {
		Square square = model.getSquare();
		
	}
	
	private void addPoint() {
		Point point = model.getPoi();
		
	}
	
}
