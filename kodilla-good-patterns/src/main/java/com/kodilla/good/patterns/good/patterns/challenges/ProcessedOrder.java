package com.kodilla.good.patterns.good.patterns.challenges;

public class ProcessedOrder {
    private User user;
    private boolean processed;

    public ProcessedOrder(User user, boolean processed) {
        this.user = user;
        this.processed = processed;
    }

    public User getUser() {
        return user;
    }

    public boolean isProcessed() {
        return processed;
    }
}
