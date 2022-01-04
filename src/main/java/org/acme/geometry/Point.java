package org.acme.geometry;

public class Point implements Geometry {

	private Coordinate coordinate;
	
	public Point() {
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
		if(coordinate == null) {
			this.coordinate = new Coordinate();
		}
		else {
			this.coordinate = coordinate;
		}
	}
	
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
	
	@Override
	public String getType() {
		return "Point";
	}
	
	@Override
	public Boolean isEmpty() {
		return this.coordinate.isEmpty();
	}
	
	@Override
	public void translate(double dx, double dy) {
		double xt = this.coordinate.getX() + dx;
		double yt = this.coordinate.getY() + dy;
		
		Coordinate tcoordinate = new Coordinate(xt, yt);
		
		this.coordinate = tcoordinate;
	}
	

}
