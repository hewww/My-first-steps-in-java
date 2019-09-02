package com.kodilla.exception.test;

public class ExceptionHandling {
    public void Exception() {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.0,3.0);
        } catch (Exception e) {
            System.out.println("You put wrong numbers! " + e);
        } finally {
            System.out.println("End working program");
        }
    }
}
