package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{

	private List<Point> points;
	
	public LineString() {
		this.points = new ArrayList<Point>();
	}
	
	public LineString(List<Point> points) {
		assert (points != null);
		this.points = points;
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
	
	@Override
	public void translate(double dx, double dy) {

        for (Point point : points) {

            point.translate(dx, dy);
            
        }        
    }
	
	@Override
	public LineString clone(){
		List<Point> pointsCopy = new ArrayList<Point>();
        for (Point point : points) {
            pointsCopy.add(point.clone());
        }
        return new LineString(pointsCopy);
	}

	@Override
	public Envelope getEnvelope() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
        for (Point point : points) {
			builder.insert(point.getCoordinate());
        }
        return builder.build();
	}
	
	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
	}
}
