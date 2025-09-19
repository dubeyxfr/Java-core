package in.kgcoding.Abstration;

import in.kgcoding.geometry.Circle;

public class ShapeTest {
    public static void main(String[] args) {
        circle circle = new circle(4);
        Square square = new Square(6);
        System.out.printf("Area of the circle %f\n",circle.CalculateArea());
        System.out.printf("Area of the Square %f\n",square.CalculateArea());
    }
}
