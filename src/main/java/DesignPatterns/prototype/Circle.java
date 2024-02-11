package DesignPatterns.prototype;

import java.awt.*;

public class Circle implements shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {

    }
}
