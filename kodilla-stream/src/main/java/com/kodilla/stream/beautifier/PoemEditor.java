package com.kodilla.stream.beautifier;

public class PoemEditor {
    public static String bigger(String text) {
        return text.toUpperCase();
    }

    public static String addLetters(String text) {
        return "AAA" + text + "AAA";
    }

    public static String addDollars(String text) {
        return "$$$" + text + "$$$";
    }
}