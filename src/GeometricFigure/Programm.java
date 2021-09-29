package GeometricFigure;

import GeometricFigure.Figures.ColorFigure;
import GeometricFigure.Figures.Square;

public class Programm {

    public static void main(String[] args) {
        Square square = new Square(3, ColorFigure.GREEN);
        square.toString();
        square.hashCode();
    }
}
