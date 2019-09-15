package com.kodilla.good.patterns.good.patterns.MyImplement;

public class ProducentFactory {

    public Producent generateProducent(String producentName) {

        if(producentName.equals("CocaCola")) {
            return new CocaCola();
        } else if(producentName.equals("Pepsi")) {
            return new Pepsi();
        } else if(producentName.equals("Nestle")) {
            return new Nestle();
        } else {
            System.out.println("Brak producenta");
            return null;
        }
    }
}
