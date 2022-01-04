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
		
		Assert.assertEquals(3.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(5.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, l.getPointN(1).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(2, l.getNumPoints(), EPSILON);
		Assert.assertEquals(A, l.getPointN(0));
	}
	
	@Test
	public void testIsEmpty(){
		LineString l1 = new LineString();
		Coordinate c = new Coordinate(3.0,4.0);
		Coordinate d = new Coordinate(5.0,4.0);
		
		Point A = new Point(c);
		Point B = new Point(d);
		
		List<Point> points = new ArrayList<Point>();
		points.add(A);
		points.add(B);
		
		LineString l2 = new LineString(points);
		Assert.assertTrue(l1.isEmpty());
		Assert.assertFalse(l2.isEmpty());
	}
	
	@Test
	public void testTranslate(){
		Coordinate c = new Coordinate(3.0,4.0);
		Coordinate d = new Coordinate(5.0,4.0);
		
		Point A = new Point(c);
		Point B = new Point(d);
		
		List<Point> points = new ArrayList<Point>();
		points.add(A);
		points.add(B);
		
		LineString l = new LineString(points);
		l.translate(1.0, 1.0);
		
		Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(6.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, l.getPointN(1).getCoordinate().getY(), EPSILON);
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
		
		lc.translate(1.0, 1.0);
		
		Assert.assertEquals(4.0, lc.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, lc.getPointN(0).getCoordinate().getY(),EPSILON);
		Assert.assertEquals(6.0, lc.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, lc.getPointN(1).getCoordinate().getY(),EPSILON);
		Assert.assertEquals(3.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getY(),EPSILON);
		Assert.assertEquals(5.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, l.getPointN(1).getCoordinate().getY(),EPSILON);
	}
}
