package com.kodilla.spring.Forum;


import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String username = "John Smith";

    public void ForumUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
