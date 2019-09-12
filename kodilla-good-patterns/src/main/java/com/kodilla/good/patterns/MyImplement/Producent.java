package com.kodilla.good.patterns.MyImplement;

import java.util.ArrayList;
import java.util.List;

public interface Producent {
    List<Product> products();
    boolean process();
    String getCompanyName();
}
