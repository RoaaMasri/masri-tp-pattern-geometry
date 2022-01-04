package org.acme.geometry;

public class WktWrite {
    public WktWrite(){

    }

    public String write(Geometry geometry){
        String type = geometry.getType().toUpperCase();
        if (geometry.isEmpty()){
            return (type + "EMPTY");
        }
        else{
            if (geometry instanceof Point){
                Point point = (Point)geometry;
                return (type + "(" + point.getCoordinate().getX() + " " + 
                point.getCoordinate().getY() + ")");
            }
            else if (geometry instanceof LineString) {
                LineString line = (LineString)geometry;
                String outString = "(";
                for (int i = 0; i < line.getNumPoints()-1; i++){
                    Point point = line.getPointN(i);
                    outString += point.getCoordinate().getX() + " " + 
                    point.getCoordinate().getY() + ",";
                }
                outString+=line.getPointN(line.getNumPoints()-1).getCoordinate().getX() +
                 " " + line.getPointN(line.getNumPoints()-1).getCoordinate().getY() + ")";
                return type + outString;
            }else{
                throw new RuntimeException("geometry type not supported");
            }    
        }
    }


}
