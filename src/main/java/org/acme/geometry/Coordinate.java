package org.acme.geometry;

public class Coordinate {
	double x;
	double y;
	
	public Coordinate() {
		this(0.0, 0.0);
	}
	
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}

	public Boolean isEmpty() {
	  	if(Double.isNaN(x)|| Double.isNaN(y)){
            return true;
        }

        return false;
	}
}
