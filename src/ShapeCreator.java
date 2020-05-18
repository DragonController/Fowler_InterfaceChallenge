import processing.core.PApplet;

import java.util.ArrayList;

public class ShapeCreator extends PApplet {

    //you'll need a structure to hold many shapes
    Shape shape1, shape2, shape3, shape4, shape5, shape6, shape7, shape8, shape9;

    public void settings() {
        size(500,500);
    }

    public void setup() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(100, 100, 0));
        points.add(new Point(150, 150, 0));
        points.add(new Point(200, 100, 0));
        points.add(new Point(50, 200, 0));
        points.add(new Point(200, 300, 0));
        points.add(new Point(250, 150, 0));
        Calculations calc = new Calculations();
        for (Line line : calc.CalculateLines(points)) {
            line.draw(this);
        }
    }

    public void draw() {

    }

}