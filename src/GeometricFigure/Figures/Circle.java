package GeometricFigure.Figures;
//Круг
public class Circle extends Figure {
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
}
