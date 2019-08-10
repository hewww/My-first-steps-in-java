package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestSuiteStatistics {

    //OK
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

        Assert.assertEquals(5 ,averagePValue);
    }

    //OK
    @Test
    public void test1000Posts() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for(int i=0; i < 1000; i++) {
            usersNames.add("someone");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(50);
        CalculateStatistics calculateStatistics = new CalculateStatistics();


        calculateStatistics.calculateAdvStatistics(statisticsMock);

        int averagePValue = calculateStatistics.getAverageP();
        int averageCperUValue = calculateStatistics.getAverageCperU();
        int averageCperPValue = calculateStatistics.getAverageCperP();

        Assert.assertEquals(5 ,averagePValue);
    }

    //ERROR
    @Test
    public void test0Comments() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        //for(int i=0; i < 1000; i++) {
        //    usersNames.add("someone");
        //}
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(50);
        CalculateStatistics calculateStatistics = new CalculateStatistics();


        calculateStatistics.calculateAdvStatistics(statisticsMock);

        int averagePValue = calculateStatistics.getAverageP();
        int averageCperUValue = calculateStatistics.getAverageCperU();
        int averageCperPValue = calculateStatistics.getAverageCperP();


        Assert.assertEquals(0 ,averagePValue);
    }

    //OK
    @Test
    public void testCLessThanP() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for(int i=0; i < 1000; i++) {
            usersNames.add("someone");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(40);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePValue = calculateStatistics.getAverageP();

        Assert.assertEquals(2 ,averagePValue);
    }

    //OK
    @Test
    public void testCMoreThanP() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for(int i=0; i < 1000; i++) {
            usersNames.add("someone");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(20);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePValue = calculateStatistics.getAverageP();

        Assert.assertEquals(0 ,averagePValue);
    }

    //ERROR
    @Test
    public void test0Users() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        //for(int i=0; i < 1000; i++) {
        //    usersNames.add("someone");
        //}
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(20);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averagePValue = calculateStatistics.getAverageP();

        Assert.assertEquals(0 ,averagePValue);
    }

    //OK
    @Test
    public void test100Users() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for(int i=0; i < 100; i++) {
            usersNames.add("someone");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(20);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int averageCperUValue = calculateStatistics.getAverageCperU();

        Assert.assertEquals(1 ,averageCperUValue);
    }







}


