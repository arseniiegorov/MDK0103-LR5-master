package shapes;

import interfaces.Movable;

public class Point implements Movable {

    private float x;

    private float y;

    private static final double speed = 1.0;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "shapes.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void moveUp() {
        y += speed;
    }

    @Override
    public void moveDown() {
        y -= speed;
    }

    @Override
    public void moveRight() {
        x += speed;
    }

    @Override
    public void moveLeft() {
        x -= speed;
    }
}
