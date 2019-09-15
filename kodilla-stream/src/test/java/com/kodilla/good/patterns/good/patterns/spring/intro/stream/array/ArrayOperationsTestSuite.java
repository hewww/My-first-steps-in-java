package com.kodilla.good.patterns.good.patterns.spring.intro.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbersList = {123,124,12,31,4,1,51,14,41,5,12,421,521,51,51,521,512,63,136,12};
        //When
        double result = ArrayOperations.getAverage(numbersList);
        //Then
        Assert.assertEquals(135.3,result,0.001);

    }
}
