package org.acme.geometry;

import java.util.ArrayList;

public class EnvelopeBuilder {
	
	private ArrayList<Coordinate> coordinates;

	public EnvelopeBuilder() {
		this.coordinates = new ArrayList<Coordinate>();
	}
	
	public void insert(Coordinate coordinate) {
		this.coordinates.add(coordinate);
	}
	
	public Envelope build() {
		Double Xmin = coordinates.get(0).getX();
		Double Ymin = coordinates.get(0).getY();
		Double Xmax = coordinates.get(0).getX();
		Double Ymax = coordinates.get(0).getY();
		
		for(Coordinate coordinate : coordinates) {
			if (coordinate.getX() < Xmin) {
				Xmin = coordinate.getX();
			}
			if (coordinate.getX() > Xmax) {
				Xmax = coordinate.getX();
			}
			if (coordinate.getY() < Ymin) {
				Ymin = coordinate.getY();
			}
			if (coordinate.getY() > Ymax) {
				Ymax = coordinate.getY();
			}
			
		}
		Coordinate enBottomLeft = new Coordinate(Xmin, Ymin);
		Coordinate enTopRight= new Coordinate(Xmax, Ymax);
	    
	
	    Envelope env = new Envelope(enBottomLeft, enTopRight);
	
	    return env; 	
	}
}
