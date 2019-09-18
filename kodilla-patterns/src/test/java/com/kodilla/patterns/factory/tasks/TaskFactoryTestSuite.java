package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void taskFactoryTest() {
        TaskFactory factory = new TaskFactory();

        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        Task paitingTask = factory.makeTask(TaskFactory.PAITINGTASK);
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);

        Assert.assertEquals("Deliver",drivingTask.getTaskName());
        Assert.assertEquals("Paiting",paitingTask.getTaskName());
        Assert.assertEquals("Shopping",shoppingTask.getTaskName());
    }
}
