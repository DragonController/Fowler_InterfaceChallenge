import processing.core.PApplet;
public class ShapeCreator extends PApplet {

    //you'll need a structure to hold many shapes
    Shape shape1, shape2, shape3, shape4, shape5, shape6, shape7, shape8, shape9;

    public void settings() {
        size(500,500);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture
        shape1 = new Circle(new Point(200.0, 200.0), 50.0);
        shape2 = new Circle(new Point(200.0, 200.0), 50.0);
        shape3 = new Circle(new Point(300.0, 300.0), 100.0);
        shape4 = new Rectangle(new Point(50.0, 50.0), 10.0, 40.0);
        shape5 = new Rectangle(new Point(0.0, 0.0), 20.0, 20.0);
        shape6 = new Circle(new Point(10.0, 10.0), 0.1);
        shape7 = new Circle(new Point(20.0, 20.0), 0.2);
        shape8 = new Rectangle(new Point(30.0, 30.0), 5.0, 6.0);
        shape9 = new Rectangle(new Point(40.0, 40.0), 8.0, 7.0);
    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        shape1.draw(this);
        shape2.draw(this);
        shape3.draw(this);
        shape4.draw(this);
        shape5.draw(this);
        shape6.draw(this);
        shape7.draw(this);
        shape8.draw(this);
        shape9.draw(this);
    }

}