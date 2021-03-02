package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest  {

    @Test
    public void test_get_area_of_a_circle(){
        Circle circle = new Circle("kolobok", test_get_area_of_a_circle_radius);

        assertEquals(Math.PI * Math.pow(TestData.test_get_area_of_a_circle_radius, 2), circle.getArea());
    }

    @Test
    public void test_get_perimeter_of_a_circle(){
        Circle circle = new Circle("small picture", test_get_perimeter_of_a_circle_radius);

        assertEquals(2 * Math.PI * TestData.test_get_perimeter_of_a_circle_radius, circle.getPerimeter());
    }

    @Test
    public void test_get_perimeter_of_a_rectangle(){
        Rectangle rectangle = new Rectangle("big picture", test_get_perimeter_of_a_rectangle_a, TestData.test_get_perimeter_of_a_rectangle_b);

        assertEquals(2 * (TestData.test_get_perimeter_of_a_rectangle_a + TestData.test_get_perimeter_of_a_rectangle_b),
                rectangle.getPerimeter());
    }

    @Test
    public void test_get_area_of_a_rectangle(){
        Rectangle rectangle = new Rectangle("small picture", test_get_area_of_a_rectangle_a, test_get_area_of_a_rectangle_b);

        assertEquals(TestData.test_get_area_of_a_rectangle_a * TestData.test_get_area_of_a_rectangle_b,
                rectangle.getArea());
    }

    @Test
    public void test_get_perimeter_of_a_square() {
        Square square = new Square("SpongeBob", test_get_perimeter_of_a_square_a);

        assertEquals(4 * TestData.test_get_perimeter_of_a_square_a,
                square.getPerimeter());
    }

    @Test
    public void test_get_area_of_a_square(){
        Square square = new Square("SquarePants", test_get_area_of_a_square_a);

        assertEquals(Math.pow(TestData.test_get_area_of_a_square_a,2),
                square.getArea());
    }

}
