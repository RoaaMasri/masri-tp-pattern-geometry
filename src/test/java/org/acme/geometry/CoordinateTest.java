package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
		
	}
	
	@Test
	public void testConstructorXY(){
		Coordinate c = new Coordinate(3.0,4.0);
		Assert.assertEquals(3.0, c.getX(), EPSILON);
		Assert.assertEquals(4.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testIsEmpty(){
		Coordinate c1 = new Coordinate();
		Coordinate c2 = new Coordinate(3.0,4.0);
		Coordinate c3 = new Coordinate(Double.NaN,3.0);
		Assert.assertTrue(c1.isEmpty());
		Assert.assertFalse(c2.isEmpty());
		Assert.assertTrue(c3.isEmpty());
	}
	
	
	
}
