package com.app;

public class Square extends Quadrangle {

    public Square(String m_name, double m_a) {
        super(m_name, m_a, m_a, m_a, m_a);
    }

    @Override
    public double getArea() {
        return Math.pow(m_a, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * m_a;
    }
}
