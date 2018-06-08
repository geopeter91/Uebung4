package main;

import main.geometry.Point;
import main.geometry.Tetragon;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point("P1",0,0);
		Point p2 = new Point("P2",0,1);
		Point p3 = new Point("P3",1,1);
		Point p4 = new Point("P4",1,0);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		Tetragon tetra1 = new Tetragon("TetraPack");
		tetra1.setPoints(p1, p2, p3, p4);
		System.out.println(tetra1);
	}

}
