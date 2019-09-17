package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanConfig {
    @Autowired
    Board board;

    @Bean(name="toDoList")
    public TaskList toDoList() {

        System.out.println(board.toDoList.tasks.toString());
        return null;
    }

    @Bean(name="inProgressList")
    public TaskList inProgressList() {

        return null;
    }

    @Bean(name="doneList")
    public TaskList doneList() {
        //System.out.println(taskList.tasks.toString());
        return null;
    }



}
