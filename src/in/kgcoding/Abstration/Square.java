package in.kgcoding.Abstration;

public class Square extends Shape {
    public final double SideinCm;

    public Square(double sideinCm) {
        SideinCm = sideinCm;
    }

    public double getSideinCm() {
        return SideinCm;
    }

    @Override
    public double CalculateArea() {
        return Math.pow(SideinCm,2);
    }
}
