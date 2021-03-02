package com.app;

public class Rectangle extends Quadrangle {

    public Rectangle(String m_name, double m_a, double m_b) {
        super(m_name, m_a, m_b, m_a, m_b);
    }

    @Override
    public double getArea() {
        return m_a * m_b;
    }

    @Override
    public double getPerimeter() {
        return m_a * 2 + m_b * 2;
    }
}
