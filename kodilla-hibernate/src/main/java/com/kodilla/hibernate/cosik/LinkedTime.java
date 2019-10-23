package com.kodilla.hibernate.cosik;

import org.apache.logging.log4j.util.Strings;

import java.util.LinkedList;

public class LinkedTime {
    private Book book;

    public static void main(String args[])  {
        LinkedList<Book> bookList = new LinkedList<>();

        for(int n = 0; n < 300000; n++) {
            bookList.add(new Book("cos","cos"));
        }

        long begin = System.nanoTime();
        bookList.remove(bookList.size()-1);
        long end = System.nanoTime();

        long begin2 = System.nanoTime();
        bookList.remove(0);
        long end2 = System.nanoTime();

        System.out.println("czas usuwania z początku listy to : " + (end2-begin2) + " ns");
        System.out.println("czas usuwania z końca listy to : " + (end-begin) + " ns");
    }
}
