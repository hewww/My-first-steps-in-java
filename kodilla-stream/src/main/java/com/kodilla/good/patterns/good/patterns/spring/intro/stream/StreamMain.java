package com.kodilla.good.patterns.good.patterns.spring.intro.stream;

import com.kodilla.good.patterns.good.patterns.spring.intro.stream.book.Book;
import com.kodilla.good.patterns.good.patterns.spring.intro.stream.book.BookDirectory;
import com.kodilla.good.patterns.good.patterns.spring.intro.stream.forumuser.Forum;
import com.kodilla.good.patterns.good.patterns.spring.intro.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum theForum = new Forum();

        Map<Integer,ForumUser> theResultOfForumUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.birthday.getYear() < 1999)
                .filter(forumUser -> forumUser.getPostsquantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Elementty po przefiltorwaniu :" + theResultOfForumUsers.size());
        theResultOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}