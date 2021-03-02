package com.app;

public class Motorcycle extends Vehicle{

    public float m_hand_breaks_size;

    public Motorcycle(int m_numberOfWheels, String m_model, float m_hand_breaks_size) {
        super(m_numberOfWheels, m_model);
        this.m_hand_breaks_size = m_hand_breaks_size;
    }

    @Override
    public int getMaxNumberOfPassengers() {
        return TestData.test_max_number_of_passengers_on_the_motorcycle;
    }

    @Override
    public int getMaxSpeed() {
        return TestData.test_max_speed_of_the_motorcycle;
    }
}
