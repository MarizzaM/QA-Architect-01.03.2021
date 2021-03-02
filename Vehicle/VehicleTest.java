package com.app;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class VehicleTest {


    @Test
    public void test_get_max_number_of_passengers_in_the_car(){
        Car hennessey  = new Car(4, "VenomGT", 3);

        assertEquals(TestData.test_max_number_of_passengers_in_the_car, hennessey.getMaxNumberOfPassengers());
    }

    @Test
    public void test_get_max_speed_of_the_car(){
        Car bugatti  = new Car(4, "Chiron", 3);

        assertEquals(TestData.test_max_speed_of_the_car, bugatti.getMaxSpeed());
    }

    @Test
    public void test_get_max_number_of_passengers_in_the_motorcycle(){
        Motorcycle kawasaki = new Motorcycle(2, "ninja ZX-11", 2);

        assertEquals(TestData.test_max_number_of_passengers_on_the_motorcycle, kawasaki.getMaxNumberOfPassengers());
    }

    @Test
    public void test_get_max_speed_of_the_motorcycle(){
        Motorcycle bmv = new Motorcycle(2, "K 1200 S", 2);

        assertEquals(TestData.test_max_speed_of_the_motorcycle, bmv.getMaxSpeed());
    }



}
