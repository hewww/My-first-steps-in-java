package com.kodilla.patterns.factory.tasks;

public class PaitingTask implements Task {

    private String taskname;
    private String color;
    private String whatToPaint;

    public PaitingTask(String taskname, String color, String whatToPaint) {
        this.taskname = taskname;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
