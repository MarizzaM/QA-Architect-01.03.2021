package com.app;

public abstract class Vehicle {

    protected int m_numberOfWheels;
    protected String m_model;

    public Vehicle(int m_numberOfWheels, String m_model) {
        this.m_numberOfWheels = m_numberOfWheels;
        this.m_model = m_model;
    }

    public abstract int getMaxNumberOfPassengers();

    public abstract int getMaxSpeed();
}
