package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName = "Circle";
    Integer shapeField = 25;
    public Circle(String shapeName, Integer shapeField) {
        this.shapeField = shapeField;
        this.shapeName = shapeName;
    }

    public String getShapeName() {
    return shapeName;
    }

    public Integer getShapeField(){
    return shapeField;
    }
}
