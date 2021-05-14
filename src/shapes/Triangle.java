package shapes;

import java.awt.*;

public class Triangle extends Shape {

    private int base;

    private int height;

    public Triangle() {
    }

    public Triangle(String color, Boolean filled, int base, int height) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "shapes.Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}

