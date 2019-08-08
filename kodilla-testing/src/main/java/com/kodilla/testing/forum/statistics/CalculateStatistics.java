package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private int averageP;



    public void calculateAdvStatistics(Statistics statistics) {

        int usersCount = statistics.usersNames().size();

        int commentsCount = statistics.commentsCount();

        int postsCount = statistics.postsCount();

        averageP = postsCount / commentsCount;

        int averageCperU = commentsCount / usersCount;

        int averageCperP = commentsCount / postsCount;


    }

    public int getAverageP() {
        return averageP;
    }
}








