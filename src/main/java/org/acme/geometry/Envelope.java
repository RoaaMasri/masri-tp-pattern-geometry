package org.acme.geometry;

public class Envelope {
	
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Envelope() {
		this.bottomLeft = new Coordinate();
        this.topRight = new Coordinate();
	}
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public Boolean isEmpty() {
		return(this.bottomLeft.isEmpty() || this.topRight.isEmpty());
	}
	
	public double getXmin() {
		return bottomLeft.getX();
	}
	
	public double getYmin() {
		return bottomLeft.getY();
	}
	
	public double getXmax() {
		return topRight.getX();
	}
	
	public double getYmax() {
		return topRight.getY();
	}
	
}
