package DesignPatterns.prototype;

public class ShapeClient {

    private shape anyShape;

    public ShapeClient(shape anyShape) {
        this.anyShape = anyShape;
    }

    public shape getShape() {
       return anyShape.clone();
    }
}
