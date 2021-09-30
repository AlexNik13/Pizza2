package GeometricFigure.Figures;

public abstract class Figure implements AreaPerimeter {
    private String name;
    private ColorFigure color;


    public Figure(String name, ColorFigure color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColorFigure getColor() {
        return color;
    }

    public void setColor(ColorFigure color) {
        this.color = color;
    }


}
