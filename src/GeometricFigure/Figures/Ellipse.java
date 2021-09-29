package GeometricFigure.Figures;
//Элипс
public class Ellipse extends Figure{
    private double focusA;
    private double focusB;

    public Ellipse(double focusA, double focusB, ColorFigure color) {
        super("Элипс", color);
        this.focusA = focusA;
        this.focusB = focusB;
    }
}
