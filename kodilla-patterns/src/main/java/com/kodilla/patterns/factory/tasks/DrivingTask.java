package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskname;
    private String where;
    private String using;

    public DrivingTask(String taskname, String where, String using) {
        this.taskname = taskname;
        this.where = where;
        this.using = using;
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
