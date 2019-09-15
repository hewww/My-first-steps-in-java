package com.kodilla.good.patterns.good.patterns.spring.intro.stream.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("98765432101234567890");
        return sandQuantity;
    }
}