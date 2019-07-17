package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

        private static int testCounter = 0;
        private static int testCounterEnd = 0;

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

        @After
        public void afterEveryTest() {
            testCounterEnd++;
            System.out.println("Test Passed #" + testCounterEnd);
        }

        @Test
        public void testGetShapeName() {

            //Given
            Circle circle = new Circle("Circle",25);
            Triangle triangle = new Triangle("Triangle",35);
            Square square = new Square("Square",45);

            //When
            String shapeName1 = circle.getShapeName();
            String shapeName2 = triangle.getShapeName();
            String shapeName3 = square.getShapeName();

            //Then
            Assert.assertEquals("Circle", shapeName1);
            Assert.assertEquals("Triangle", shapeName2);
            Assert.assertEquals("Square", shapeName3);
        }

        @Test
        public void testAddFigure() {

            //Give
            Circle circle = new Circle("Circle",25);
            List<Shape> figures = new ArrayList<>();

            //When
            figures.add(circle);

            //Then
            Assert.assertEquals(1,figures.size());

        }

        @Test
        public void testRemoveFigure() {
            //Give
            Circle circle = new Circle("Circle",25);
            List<Shape> figures = new ArrayList<>();
            figures.add(circle);
            System.out.println("Rozmiar listy to : " + figures.size());
            System.out.println("Usuwam...");

            //When
            figures.remove(circle);
            System.out.println("Usunięto");

            //Then
            Assert.assertEquals(0,figures.size());
        }

        @Test
        public void testGetFigure() {
            //Then
            Circle circle = new Circle("Circle",25);
            List<Shape> figures = new ArrayList<>();
            figures.add(circle);

            //When
            Shape object;
            object = figures.get(0);

            //Then
            Assert.assertEquals(object,circle);

        }

        //W zadaniu nie jest podane co tam metoda robi, więc.. jak ją przetestować?/////////////////////////////
        @Ignore
        public void testShowFigures() {
            Circle circle = new Circle("Circle",25);
            List<Shape> figures = new ArrayList<>();
            figures.add(circle);

            //When

        }
}
