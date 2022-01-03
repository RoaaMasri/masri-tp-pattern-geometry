package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {	

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		LineString l = new LineString();
		Assert.assertEquals(true, l.isEmpty());
	}
	
	@Test
	public void testConstructo(){
		Coordinate c = new Coordinate(3.0,4.0);
		Coordinate d = new Coordinate(5.0,4.0);
		
		Point A = new Point(c);
		Point B = new Point(d);
		
		List<Point> points = new ArrayList<Point>();
		points.add(A);
		points.add(B);
		
		LineString l = new LineString(points);
		
		Assert.assertEquals(false, l.isEmpty());
		Assert.assertEquals(2, l.getNumPoints());
		Assert.assertEquals(A, l.getPointN(0));
	}
}
