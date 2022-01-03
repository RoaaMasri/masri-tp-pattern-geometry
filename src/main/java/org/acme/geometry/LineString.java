package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{

	private List<Point> points;
	
	public LineString() {
		this.points = new ArrayList<Point>();
	}
	
	public LineString(ArrayList<Point> points) {
		if(points == null) {
			this.points = new ArrayList<Point>();
		}
		else {
			this.points = points;
		}
	}
	
	public int getNumPoints() {
		return points.size();
	}
	
	public Point getPointN(int n) {
		return points.get(n);
	}
	
	
	@Override
	public String getType() {
		return "LineString";
	}

	@Override
	public Boolean isEmpty() {
		return this.points.isEmpty();
	}
	

}