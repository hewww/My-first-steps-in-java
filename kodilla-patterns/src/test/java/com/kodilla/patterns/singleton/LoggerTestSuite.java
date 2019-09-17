package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        Logger.getInstance().log("LOG");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("LOG",result);
    }
}
