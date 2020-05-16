public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public void draw(ShapeCreator shapeCreator) {
        shapeCreator.circle((float) getPosition().getX(), (float) getPosition().getY(), (float) radius);
    }
}