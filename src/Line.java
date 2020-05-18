public class Line {

    private Point point1, point2;

    Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void draw(ShapeCreator shapeCreator) {
        shapeCreator.line((float) point1.getX(), (float) point1.getY(), (float) point2.getX(), (float) point2.getY());
    }
}