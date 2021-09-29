package GeometricFigure;

import GeometricFigure.Figures.*;

public class Programm {

    public static void main(String[] args) {
        Square square = new Square(3, ColorFigure.GREEN);
        square.toString();
        square.hashCode();

        Triangle triangle = new Triangle(10, 4, 5, ColorFigure.YELLOW);
        triangle.toString();
        triangle.hashCode();

        Triangle triangle2 = new Triangle(3, 4, 5, ColorFigure.VIOLET);
        triangle2.toString();
        triangle2.hashCode();

        Rhomb rhomb = new Rhomb(6, 8, ColorFigure.ORANGE);
        rhomb.toString();
        rhomb.hashCode();

        Rectangle rectangle = new Rectangle(3, 10, ColorFigure.BLUE);
        rectangle.toString();
        rectangle.hashCode();

        Ellipse ellipse = new Ellipse(6, 10, ColorFigure.INDIGO);
        ellipse.toString();
        ellipse.hashCode();

        Circle circle = new Circle(15, ColorFigure.RED);
        circle.toString();
        circle.hashCode();
    }
}
