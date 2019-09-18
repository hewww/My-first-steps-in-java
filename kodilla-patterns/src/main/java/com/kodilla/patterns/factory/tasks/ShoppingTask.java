package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskname;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskname, String whatToBuy, double quantity) {
        this.taskname = taskname;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {

    }

    public String getTaskName() {
        return taskname;
    }

    public boolean isTaskExecuted() {
        return true;
    }
}
