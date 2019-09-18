package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DrivingTask";
    public static final String PAITINGTASK = "PaitingTask";
    public static final String SHOPPINGTASK = "ShoppingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Deliver","Centrum","Audi A1");
            case PAITINGTASK:
                return new PaitingTask("Paiting","White","Wall");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping","Apples" , 42);
                default:
                    return null;
        }
    }

}
