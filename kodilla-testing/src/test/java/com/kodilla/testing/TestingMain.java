package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test Pierwszy OK");
        } else {
            System.out.println("Test Pierwszy - Error!");
        }

        //<--next test-->>//

        Calculator calculator1 = new Calculator();
        calculator1.add(24,10);

        if(calculator1.getAddResult() == 34) {
            System.out.println("Test Drugi przebiegł prawidłowo ");
        } else {
            System.out.println("Test Drugi - Error!");
        }

        // next test //

        Calculator calculator2 = new Calculator();
        calculator1.substract(24,10);

        if(calculator1.getMinusResult() == 14) {
            System.out.println("Test trzeci przebiegł prawidłowo ");
        } else {
            System.out.println("Test trzeci - Error!");
        }








    }
}