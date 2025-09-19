package in.kgcoding.Abstration;

import java.util.Scanner;

public class circle extends Shape {
    public final double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

