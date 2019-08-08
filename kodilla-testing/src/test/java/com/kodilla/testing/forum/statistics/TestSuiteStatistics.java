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

        when(statisticsMock.usersNames().size()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(50);
        CalculateStatistics calculateStatistics = new CalculateStatistics();


        calculateStatistics.calculateAdvStatistics(statisticsMock);

        int x = calculateStatistics.getAverageP();

        Assert.assertEquals(5 ,x);

    }

}


