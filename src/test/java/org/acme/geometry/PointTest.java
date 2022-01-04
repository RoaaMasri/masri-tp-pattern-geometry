package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertEquals(Double.NaN, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(Double.NaN, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testConstructor(){
		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		Assert.assertEquals(3.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testType() {
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
	
	@Test
	public void testIsEmpty() {
		Point p1 = new Point();
		Coordinate c = new Coordinate(3.0,4.0);
		Point p2 = new Point(c);
		Assert.assertTrue(p1.isEmpty());
		Assert.assertFalse(p2.isEmpty());
	}
	
	@Test
	public void testTranslate() {
		Coordinate c = new Coordinate(3.0,4.0);
		Point pt = new Point(c);
		pt.translate(2.0, 3.0);
		
		Assert.assertEquals(5.0, pt.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(7.0, pt.getCoordinate().getY(), EPSILON);
		
	}
	
}
