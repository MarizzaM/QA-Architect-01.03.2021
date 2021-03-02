package com.app;

public abstract class Quadrangle extends Shape {

    double m_a, m_b, m_c, m_d;

    public Quadrangle(String m_name, double m_a, double m_b, double m_c, double m_d) {
        super(m_name);
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
        this.m_d = m_d;
    }

    @Override
    public abstract double getArea();

    @Override
    public double getPerimeter() {
        return 0;
    }
}