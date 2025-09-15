package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(3.3,4.5);
        double cirarea = Math.PI * Math.pow(cir.radius, 2);
        double Arearect = rect.breath*rect.length;
        System.out.println("Area of the circle: " +cirarea + "\nArea of the rectangle: " + Arearect);
    }
}
