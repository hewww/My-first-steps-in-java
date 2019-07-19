package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {
    public Integer size = null;
    public void exterminator(ArrayList<Integer> numbers) {
        ArrayList<Integer> podzielne = new ArrayList<Integer>();

        for(Integer i = 0; i < numbers.size(); i++) {
            Integer temporaryValue = numbers.get(i);
            if(temporaryValue %2 == 0) {
                podzielne.add(temporaryValue);
            }
            size = podzielne.size();
        }
    }

    public Integer getSize(){
        return size;
    }
}
