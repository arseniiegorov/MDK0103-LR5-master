package shapes;

public abstract class Shape {

    protected String color;

    protected Boolean filled;

    public Shape() {
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shapes.Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
