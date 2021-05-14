package shapes;

import interfaces.GeometricObject;
import interfaces.Movable;

public class Circle implements Movable, GeometricObject {

    private Point center;

    protected double radius;

    private String color;

    private static final double speed = 1.0;

    public Circle() {
        radius = 1.0;
    }

    public Circle(Point center, double radius, String color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "shapes.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                " area=" + getArea() +
                '}';
    }

    @Override
    public void moveUp() {
        center.setX((float) (center.getY() + speed));
    }

    @Override
    public void moveDown() {
        center.setX((float) (center.getY() - speed));
    }

    @Override
    public void moveRight() {
        center.setX((float) (center.getX() + speed));
    }

    @Override
    public void moveLeft() {
        center.setX((float) (center.getX() - speed));
    }
}
