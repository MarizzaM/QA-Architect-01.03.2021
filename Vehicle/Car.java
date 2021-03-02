package com.app;

public class Car extends Vehicle{
    protected int m_number_of_doors;

    public Car(int m_numberOfWheels, String m_model, int m_number_of_doors) {
        super(m_numberOfWheels, m_model);
        this.m_number_of_doors = m_number_of_doors;
    }

    @Override
    public int getMaxNumberOfPassengers() {
        return TestData.test_max_number_of_passengers_in_the_car;
    }

    @Override
    public int getMaxSpeed() {
        return TestData.test_max_speed_of_the_car;
    }
}
