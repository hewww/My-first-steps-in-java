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

        //give
        System.out.println("Rozpoczynam test dla pustej ArrayList");
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminator(numbers);
        Integer size = numbers.size();
        Integer zero = 0;
        Assert.assertEquals(zero, size);
    }

        @Test
        public void testOddNumbersExterminatorNormalList() {
            System.out.println("Rozpoczynam test dla zapełnionej ArrayList");

            //Give
            ArrayList<Integer> numbers = new ArrayList<>();
            for(Integer i = 1; i <= 10; i++) {
                numbers.add(i);
            }

            //When
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            oddNumbersExterminator.exterminator(numbers);

            //Then
            Integer piec = 5;
            Integer sizee = oddNumbersExterminator.size;
            Assert.assertEquals(piec, oddNumbersExterminator.getSize());
        }

   }
