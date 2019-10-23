package com.kodilla.hibernate.cosik;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.nanoTime;

public class KeyTime {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();

        for(int i=0; i < 300000; i++) {
            hashMap.put("key"+i,"value"+i);
        }

        long begin = nanoTime();
        hashMap.get("key250872");
        long end = nanoTime();

        long begin2 = nanoTime();
        hashMap.put("addedKey","addedValue");
        long end2 = nanoTime();

        long begin3 = nanoTime();
        hashMap.remove("key270345");
        long end3 = nanoTime();


        System.out.println("Czas wyszukiwania po kluczu to: " + (end-begin) + " ns");
        System.out.println("Czas dodawania obiektu to: " + (end2-begin2) + " ns");
        System.out.println("Czas ususwania obiektu to: " + (end3-begin3) + " ns");
    }
}
