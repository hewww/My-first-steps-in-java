package com.kodilla.stream.forumuser;

import java.time.LocalDate;



public class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    public final LocalDate birthday;
    private final int postsquantity;


    public ForumUser(final int id, final String username, char sex, LocalDate birthday, int postsquantity) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.postsquantity = postsquantity;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostsquantity() {
        return postsquantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postsquantity=" + postsquantity +
                '}';
    }
}
