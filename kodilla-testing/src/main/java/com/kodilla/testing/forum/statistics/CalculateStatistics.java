package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private int averageP;
    private int averageCperU;
    private int averageCperP;



    public void calculateAdvStatistics(Statistics statistics) {

        int usersCount = statistics.usersNames().size();

        int commentsCount = statistics.commentsCount();

        int postsCount = statistics.postsCount();

        averageP = postsCount / commentsCount;

        averageCperU = commentsCount / usersCount;

        averageCperP = commentsCount / postsCount;


    }

    public int getAverageP() {
        return averageP;
    }
    public int getAverageCperU() { return averageCperU;}
    public int getAverageCperP() { return averageCperP;}
}








