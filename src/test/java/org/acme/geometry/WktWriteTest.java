package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WktWriteTest {
    public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testWriteEmptyPoint(){
		Geometry g = new Point();
        WktWrite writer = new WktWrite();
        Assert.assertEquals("POINT EMPTY", writer.write(g));
	}

    @Test
	public void testWriteEmptyLineString(){
		Geometry g = new LineString();
        WktWrite writer = new WktWrite();
        Assert.assertEquals("LINESTRING EMPTY", writer.write(g));
	}

    @Test
	public void testWritePoint(){
		Geometry g = new Point(new Coordinate(3.0,4.0));
        WktWrite writer = new WktWrite();
        Assert.assertEquals("POINT(3.0 4.0)", writer.write(g));
	}

    @Test
	public void testWriteLineString(){
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(new Coordinate(1.0,2.0)));
        points.add(new Point(new Coordinate(6.0,8.0)));
		Geometry g = new LineString(points);
        WktWrite writer = new WktWrite();
        Assert.assertEquals("LINESTRING(1.0 2.0,6.0 8.0)", writer.write(g));
	}
}
