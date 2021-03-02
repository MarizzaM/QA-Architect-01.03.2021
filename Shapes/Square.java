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

    @Override
    public String toString() {
        return "Square{" +
                "m_a=" + m_a +
                ", m_b=" + m_b +
                ", m_c=" + m_c +
                ", m_d=" + m_d +
                ", m_name='" + m_name + '\'' +
                "} " + super.toString();
    }
}
