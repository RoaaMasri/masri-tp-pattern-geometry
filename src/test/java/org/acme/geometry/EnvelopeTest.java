package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Envelope en = new Envelope();
		Assert.assertEquals(Double.NaN, en.getXmin(), EPSILON);
		Assert.assertEquals(Double.NaN, en.getYmin(), EPSILON);
		Assert.assertEquals(Double.NaN, en.getXmax(), EPSILON);
		Assert.assertEquals(Double.NaN, en.getYmax(), EPSILON);
	}
	
	public void testConstructor(){
		Envelope en = new Envelope(new Coordinate(2.0, 1.0), new Coordinate(4.0, 3.0));
		Assert.assertEquals(2.0, en.getXmin(), EPSILON);
		Assert.assertEquals(1.0, en.getYmin(), EPSILON);
		Assert.assertEquals(4.0, en.getXmax(), EPSILON);
		Assert.assertEquals(3.0, en.getYmax(), EPSILON);
	}
	
    @Test
	public void testIsEmpty(){
    	Envelope en1 = new Envelope();
    	Envelope en2 = new Envelope(new Coordinate(2.0, 1.0), new Coordinate(4.0, 3.0));
		Assert.assertTrue(en1.isEmpty());
        Assert.assertFalse(en2.isEmpty());
	}
    
}
