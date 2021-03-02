package com.app;

public class Circle extends Shape {

    protected double m_radius;

    public Circle(String m_name, double m_radius) {
        super(m_name);
        this.m_radius = m_radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(m_radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * m_radius;
    }

}