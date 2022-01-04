package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor {

    PrintStream printStream;

    public LogGeometryVisitor(PrintStream printStream){
        this.printStream = printStream;
    }

    @Override
    public void visit(Point point) {
        printStream.println("Je suis un point avec x=" + point.getCoordinate().getX()
        + " et y=" + point.getCoordinate().getY());
        
    }

    @Override
    public void visit(LineString lineString) {
        printStream.println("Je suis une polyligne définie par " + lineString.getNumPoints() 
        + " point(s)");
        
    }
    
}
