package GeometricFigure;

import GeometricFigure.Figures.*;

public class Programm {

    public static void main(String[] args) {
        Square square = new Square(3, ColorFigure.GREEN);
        System.out.println(square.toString());
        System.out.println(square.hashCode());

        Triangle triangle = new Triangle(10, 4, 5, ColorFigure.YELLOW);
        System.out.println(triangle.toString());
        System.out.println(triangle.hashCode());

        Triangle triangle2 = new Triangle(3, 4, 5, ColorFigure.VIOLET);
        System.out.println(triangle2.toString());
        System.out.println(triangle2.hashCode());

        Rhomb rhomb = new Rhomb(6, 8, ColorFigure.ORANGE);
        System.out.println(rhomb.toString());
        System.out.println(rhomb.hashCode());

        Rectangle rectangle = new Rectangle(3, 10, ColorFigure.BLUE);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.hashCode());

        Ellipse ellipse = new Ellipse(6, 10, ColorFigure.INDIGO);
        System.out.println(ellipse.toString());
        System.out.println(ellipse.hashCode());

        Circle circle = new Circle(15, ColorFigure.RED);
        System.out.println(circle.toString());
        System.out.println(circle.hashCode());


    }
}
