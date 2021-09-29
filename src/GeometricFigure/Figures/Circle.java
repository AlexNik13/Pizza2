package GeometricFigure.Figures;

import java.util.Formatter;

//Круг
public class Circle extends Figure implements AreaPerimeter {
    private double radius;

    public Circle(double radius, ColorFigure color) {
        super("Окружность", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
