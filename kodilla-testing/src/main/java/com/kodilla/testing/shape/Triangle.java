package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    Integer shapeField = null;

    public Triangle(String shapeName, Integer shapeField) {
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
