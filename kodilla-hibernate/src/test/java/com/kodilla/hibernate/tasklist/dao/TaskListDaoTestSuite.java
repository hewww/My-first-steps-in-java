package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Queue list";
    private static final String DESCRIPTION = "Opis listy";

    @Test
    public void testFindByListName() {

        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //when
        taskListDao.save(taskList);

        //then
        int id = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(id);
        Assert.assertTrue(readTaskList.isPresent());

        //clean
        taskListDao.deleteById(id);
    }
}
