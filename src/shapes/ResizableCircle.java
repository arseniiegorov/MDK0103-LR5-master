package shapes;

import interfaces.Resizable;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(Point center, double radius, String color) {
        super(center, radius, color);
    }

    @Override
    public void resize(int percent) {
        radius += (radius+percent)/100;
    }
}
