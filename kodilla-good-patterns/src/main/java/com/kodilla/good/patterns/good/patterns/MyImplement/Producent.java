package com.kodilla.good.patterns.good.patterns.MyImplement;

import java.util.List;

public interface Producent {
    boolean process();
    String getCompanyName();
    List<Product> getProducts();
}
