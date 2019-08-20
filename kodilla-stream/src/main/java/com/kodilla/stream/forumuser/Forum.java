package com.kodilla.stream.forumuser;


import java.util.*;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();
    LocalDate jp = LocalDate.of(1995,12,12);

    public Forum() {
        userList.add(new ForumUser(1, "Krisula", 'M' ,LocalDate.of(2008,12,12), 12));
        userList.add(new ForumUser(2, "Mariola", 'F' ,LocalDate.of(1998,12,12), 10));
        userList.add(new ForumUser(3, "Andrzej", 'M' ,LocalDate.of(1985,12,12), 64));
        userList.add(new ForumUser(4, "Dawid",   'M' ,LocalDate.of(2004,12,12), 1));
        userList.add(new ForumUser(5, "Tobiasz", 'M' ,LocalDate.of(1991,12,12), 0));
        userList.add(new ForumUser(6, "Helena",  'F' ,LocalDate.of(1996,12,12), 25));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }
}
