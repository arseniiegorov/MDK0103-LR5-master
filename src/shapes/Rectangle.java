package shapes;

import java.awt.*;

public class Rectangle extends Shape {

    private double width;

    private double length;

    public Rectangle() {
    }

    public Rectangle(double _width, double _length){
        this.width = _width;
        this.length = _length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //TODO
    @Override
    public double getArea() {
        return 0;
    }

    //TODO
    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "shapes.Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
