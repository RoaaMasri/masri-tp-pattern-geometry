package org.acme.geometry;

public class Coordinate {
	double x;
	double y;
	
	public Coordinate() {
		x = 0.0;
		y = 0.0;
	}
	
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
