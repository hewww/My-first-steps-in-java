package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestSuiteStatistics {

    @Test
    public void testStatisticMock() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for(int i=0; i < 1000; i++) {
            usersNames.add("nic");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(50);
        CalculateStatistics calculateStatistics = new CalculateStatistics();


        calculateStatistics.calculateAdvStatistics(statisticsMock);

        int averagePValue = calculateStatistics.getAverageP();
        //int averageCperUValue = calculateStatistics.getAverageCperU();
        //int averageCperPValue = calculateStatistics.getAverageCperP();


        Assert.assertEquals(5 ,averagePValue);

    }

}


