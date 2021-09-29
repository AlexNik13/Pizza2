package GeometricFigure.Figures;

import java.util.Formatter;

//Прямоугольник
public class Rectangle extends Figure implements AreaPerimeter {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, ColorFigure color) {
        super("Прямоугольник", color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("%s, цвет: %s, периметр: %.2f, площадь %.2f", getName(), getColor().getColor(), getPerimeter(), getArea());
        System.out.println(str.toString());
        return null;
    }

    @Override
    public int hashCode() {
        System.out.printf("S*P = %.2f. Номер цвета %s \n", getPerimeter() * getArea(), getColor().ordinal() + 1);
        return 0;
    }
}
