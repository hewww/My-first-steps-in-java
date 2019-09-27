package com.kodilla.patterns.builder.Bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBicmac() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("without sezam")
                .burgers(2)
                .mustardSauce()
                .ingredient("bekon")
                .ingredient("papryczki")
                .build();

        System.out.println(bigmac);
        Assert.assertEquals(2,bigmac.getIngredients().size());
    }

}
