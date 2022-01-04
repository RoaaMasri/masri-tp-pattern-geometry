package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {	

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructorBehavior(){
		LineString l = new LineString();
		Assert.assertEquals(0, l.getNumPoints());
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
		
		Assert.assertEquals(2, l.getNumPoints(), EPSILON);
		Assert.assertEquals(A, l.getPointN(0));
	}
	
	@Test
	public void testIsEmpty(){
		
	}
	
	@Test
	public void testTranslate(){
		
	}
	
	@Test
	public void testClone(){
		Coordinate c = new Coordinate(3.0,4.0);
		Coordinate d = new Coordinate(5.0,4.0);
		
		Point A = new Point(c);
		Point B = new Point(d);
		
		List<Point> points = new ArrayList<Point>();
		points.add(A);
		points.add(B);
		
		LineString l = new LineString(points);
		LineString lc = l.clone();
		
		Assert.assertEquals(lc.getNumPoints(), l.getNumPoints(), EPSILON);
		Assert.assertEquals(lc.getPointN(0).getCoordinate(), l.getPointN(0).getCoordinate());
	}
}
