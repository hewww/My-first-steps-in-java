package com.kodilla.patterns.prototype.library;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryList {
    private final String name;
    private final List<Library> libraries = new ArrayList<>();

    public LibraryList(String name) {
        this.name = name;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "LibraryList{" +
                "name='" + name + '\'' +
                ", libraries=" + libraries +
                '}';
    }
}
