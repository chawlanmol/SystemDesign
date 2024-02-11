package DesignPatterns.prototype;

public class ShapeFactoryDemo {

    public void Demo() {
        ShapeClient shapeClient = new ShapeClient(new Circle("blue"));
        shape cloneCircle = shapeClient.getShape();
        if(shapeClient.getShape() == cloneCircle) {
            System.out.println("checking equality ==");
        } else if(shapeClient.getShape().hashCode() == cloneCircle.hashCode()) {
            System.out.println("checking equality of Equals");
        }
    }
}
