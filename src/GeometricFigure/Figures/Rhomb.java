package GeometricFigure.Figures;

import java.util.Formatter;

//Ромб
public class Rhomb extends Figure {
    private double diagonalA;
    private double diagonalB;

    public Rhomb(double diagonalA, double diagonalB, ColorFigure color) {
        super("Ромб", color);
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
    }

    public double getDiagonalA() {
        return diagonalA;
    }

    public void setDiagonalA(double diagonalA) {
        this.diagonalA = diagonalA;
    }

    public double getDiagonalB() {
        return diagonalB;
    }

    public void setDiagonalB(double diagonalB) {
        this.diagonalB = diagonalB;
    }

    @Override
    public double getArea() {
        return (diagonalA * diagonalB) / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(diagonalA / 2, 2) + Math.pow(diagonalB / 2, 2));
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("%s, цвет: %s, периметр: %.2f, площадь %.2f", getName(), getColor().getColor(), getPerimeter(), getArea());
        return str.toString();
    }

    @Override
    public int hashCode() {
        return (int) (getPerimeter() * getArea() * (getColor().ordinal() + 1));
    }

}
