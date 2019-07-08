package com.github.hcsp.polymorphism;

public class Circle extends Shape{
    // 圆的直径
    // 提示，圆周率可以使用Math.PI
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }
    public double getArea() {
        return diameter*diameter*Math.PI/4;
    }
}
