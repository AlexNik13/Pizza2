package GeometricFigure.Figures;

import javax.lang.model.type.NullType;
import java.util.Formatter;

//Квадрат
public class Square extends Figure implements AreaPerimeter {
    private double side;

    public Square(double side, ColorFigure color) {
        super("Квадрат", color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        Formatter str = new Formatter();
        str.format("%s, цвет: %s, периметр: %.2f, площадь %.2f", getName(), getColor(), getPerimeter(), getArea());
        System.out.println(str.toString());
        return null;
    }
    @Override
    public int hashCode(){
        System.out.printf("S*P = %.2f\n", getPerimeter() * getArea());
        return 0;
    }

}
