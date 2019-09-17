package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void BoardTestSuite() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("Zadanie do zrobienia");

        //board.doneList.tasks.add("Skończone zadanie");
        //board.toDoList.tasks.add("Zadanie do zrobienia");
       // board.inProgressList.tasks.add("Zadanie w Trakcie");





    }
}
