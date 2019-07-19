package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }


    public void getFigure(int n) {
        figures.get(n);
        System.out.println("figura to " + n);
    }

    public void showFigures() {

    }
}
