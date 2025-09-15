package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(3.3,4.5);
        System.out.printf("Area of the Circle: %s, Area of the RectAngle: %s",cir,rect);
    }
}
