package com.kodilla.good.patterns.good.patterns.spring.intro.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}