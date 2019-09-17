package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks()  {
        //Given
        Library library = new Library("Library main");

        library.getBooks().add(new Book("tytuł 1" , "autor 1" , LocalDate.of(2014,11,11)));
        library.getBooks().add(new Book("tytuł 2" , "autor 2" , LocalDate.of(2015,12,12)));
        library.getBooks().add(new Book("tytuł 3" , "autor 3" , LocalDate.of(2016,12,12)));
        library.getBooks().add(new Book("tytuł 4" , "autor 4" , LocalDate.of(2017,12,12)));

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Kopia 2");
        } catch (CloneNotSupportedException e) {
            System.out.println("ERROR " + e);
        }

         Library deepClonedLibrary = null;
         try {
             deepClonedLibrary = library.deepCopy();
             deepClonedLibrary.setName("DEEP KOPIA 3");
         } catch (CloneNotSupportedException e) {
             System.out.println("ERROR "+e);
         }
         System.out.println(library);
         System.out.println(clonedLibrary);
         System.out.println(deepClonedLibrary);

         //Then
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertEquals(deepClonedLibrary.getBooks(),library.getBooks());
        Assert.assertEquals(library.getBooks().size(),deepClonedLibrary.getBooks().size());

    }
}
