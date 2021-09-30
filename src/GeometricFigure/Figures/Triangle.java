package GeometricFigure.Figures;

import java.util.Formatter;

//Треугольник
public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, ColorFigure color) {
        super("Треугольник", color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if (!checkForExistence()) {
            System.out.println("Такого треугольника не существует.");
        }
    }

    private boolean checkForExistence() {
        if ((sideA + sideB) < sideC) return false;
        if ((sideA + sideC) < sideB) return false;
        if ((sideC + sideB) < sideA) return false;
        return true;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return s;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {

        if (!checkForExistence()) {
            return "Такого треугольника не существует.";
        }
        Formatter str = new Formatter();
        str.format("%s, цвет: %s, периметр: %.2f, площадь %.2f", getName(), getColor().getColor(), getPerimeter(), getArea());
        return str.toString();
    }

    @Override
    public int hashCode() {
        if (!checkForExistence()) {
            return -1;
        }
        return (int) (getPerimeter() * getArea() * (getColor().ordinal() + 1));
    }
}
