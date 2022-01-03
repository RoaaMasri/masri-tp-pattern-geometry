package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	

	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate(0.0,0.0);
		Point p = new Point();
		Assert.assertEquals(c, p.getCoordinate());
	}
	
	@Test
	public void testConstructor(){
		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		Assert.assertEquals(c, p.getCoordinate());
	}
	
	@Test
	public void testType() {
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
	
}
