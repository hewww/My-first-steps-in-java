package com.kodilla.testing.collection;
import java.util.ArrayList;
import org.junit.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: Rozpoczęty");
    }
    @After
    public void after(){
        System.out.println("Test Case: Zakonczony");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: Rozpoczęty");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: Zakonczony");
    }

    @Test
    public void testOddNumberExterminatorEmptyList() {
        System.out.println("Rozpoczynam test dla pustej ArrayList");
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminator(numbers);
        if(numbers.size() != 0) {
            System.out.println("Cos jest w lisice . Error");
        } else {
            System.out.println("Lista pusta , test udany");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Rozpoczynam test dla zapełnionej ArrayList");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(Integer i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminator(numbers);

        if(oddNumbersExterminator.size == 5) {
            System.out.println("Test udany");
        } else {
            System.out.println("ERROR");
        }




    }
}
