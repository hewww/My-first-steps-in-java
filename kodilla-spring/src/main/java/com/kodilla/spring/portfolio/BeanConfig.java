package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanConfig {

    @Bean
    public Board getBoard() {
        return new Board(new TaskList(),new TaskList(),new TaskList());
    }
}
