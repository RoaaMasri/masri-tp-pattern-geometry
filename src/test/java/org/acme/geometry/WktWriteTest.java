package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktWriteTest {
    public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testWrite(){
		Geometry g = new Point(new Coordinate(3.0,4.0));
        WktWrite writer = new WktWrite();
        Assert.assertEquals("POINT(3.0 4.0)", writer.write(g));
	}
}
