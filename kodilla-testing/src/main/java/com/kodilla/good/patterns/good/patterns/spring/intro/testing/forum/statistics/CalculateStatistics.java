package com.kodilla.good.patterns.good.patterns.spring.intro.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    private int averageP;
    private int averageCperU;
    private int averageCperP;



    public void calculateAdvStatistics(Statistics statistics) {

        int usersCount = statistics.usersNames().size();

        int commentsCount = statistics.commentsCount();

        int postsCount = statistics.postsCount();

        if(commentsCount == 0) {
            commentsCount = 1;
        }

        if(postsCount == 0) {
            postsCount = 1;
        }

        if(usersCount ==0) {
            usersCount = 1;
        }

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








