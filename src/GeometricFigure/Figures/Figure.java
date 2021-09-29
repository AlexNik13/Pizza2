package GeometricFigure.Figures;

public abstract class Figure {
    private String name;
    private String color;


    public Figure(String name, ColorFigure color) {
        this.name = name;
        this.color = color.getColor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
