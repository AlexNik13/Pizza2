package GeometricFigure.Figures;
//Прямоугольник
public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, ColorFigure color) {
        super("Прямоугольник", color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
