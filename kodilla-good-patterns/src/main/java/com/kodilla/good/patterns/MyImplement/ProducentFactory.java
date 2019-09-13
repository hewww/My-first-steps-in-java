package com.kodilla.good.patterns.MyImplement;

public class ProducentFactory {
    public Producent generateProducent(String producentName) {
        if(producentName.equals("CocaCola")) {
            return new CocaCola();
        } else {
            return null;
        }
    }
}
