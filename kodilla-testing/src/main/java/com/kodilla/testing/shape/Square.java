package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    Integer shapeField = null;

    public Square(String shapeName, Integer shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Integer getShapeField(){
        return shapeField;
    }

}
