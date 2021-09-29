package GeometricFigure.Figures;

import java.util.Formatter;

//Элипс
public class Ellipse extends Figure implements AreaPerimeter {
    private double focusA;
    private double focusB;

    public Ellipse(double focusA, double focusB, ColorFigure color) {
        super("Элипс", color);
        this.focusA = focusA;
        this.focusB = focusB;
    }

    public double getFocusA() {
        return focusA;
    }

    public void setFocusA(double focusA) {
        this.focusA = focusA;
    }

    public double getFocusB() {
        return focusB;
    }

    public void setFocusB(double focusB) {
        this.focusB = focusB;
    }


    @Override
    public double getArea() {
        return Math.PI * focusA * focusB;
    }

    @Override
    public double getPerimeter() {
        if (focusA > focusB) {
            return Math.pow(focusB / 2, 2) / focusA;
        }
        return Math.pow(focusA / 2, 2) / focusB;
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
