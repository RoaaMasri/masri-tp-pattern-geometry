package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {
	

    @Test
    public void testVisitPoint() throws UnsupportedEncodingException{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);

        Coordinate c = new Coordinate(3.0,4.0);
		Point point = new Point(c);
        point.accept(visitor);

        String output = os.toString("UTF8");

        Assert.assertEquals("Je suis un point avec x=3.0 et y=4.0", output);
    }
    
    @Test
    public void testVisitLineString() throws UnsupportedEncodingException{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);

        Coordinate c = new Coordinate(3.0,4.0);
		Coordinate d = new Coordinate(5.0,4.0);
		
		Point A = new Point(c);
		Point B = new Point(d);
		
		List<Point> points = new ArrayList<Point>();
		points.add(A);
		points.add(B);
		
		LineString lineString = new LineString(points);
        lineString.accept(visitor);

        String output = os.toString("UTF8");

        Assert.assertEquals("Je suis une polyligne définie par 2 point(s)", output);
    }
    
}
