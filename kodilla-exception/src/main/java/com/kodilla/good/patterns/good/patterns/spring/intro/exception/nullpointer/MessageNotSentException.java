package com.kodilla.good.patterns.good.patterns.spring.intro.exception.nullpointer;

public class MessageNotSentException extends Exception {
    public MessageNotSentException(final String message) {
        super(message);
    }
}