package org.acme.geometry;

public interface GeometryVisitor {

    public void visit(Point poin);
    public void visit(LineString lineString);

}
