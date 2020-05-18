import java.util.ArrayList;

public class Calculations {
    public ArrayList<Line> CalculateLines(ArrayList<Point> points) {
        ArrayList<Point> tempPoints = new ArrayList<>();
        for (Point point1 : points) {
            boolean duplicate = false;
            for (Point point2 : points) {
                if (point1.getX() == point2.getX() && point1.getY() == point2.getY() && ((point1.getZ() == point2.getZ() && tempPoints.contains(point2)) || point1.getZ() < point2.getZ())) {
                    duplicate = true;
                }
            }
            if (!duplicate)
                tempPoints.add(point1);
        }
        points = tempPoints;
        ArrayList<Line> lines = new ArrayList<>();
        for (Point point1 : points) {
            boolean edge = true;
            double minAngle = -1;
            double maxAngle = -1;
            Point minPoint = point1;
            Point maxPoint = point1;
            for (Point point2 : points) {
                if (!(point1.getX() == point2.getX() && point1.getY() == point2.getY() && point1.getZ() == point2.getZ())){
                    double angle = Math.atan((point1.getY() - point2.getY()) / (point1.getX() - point2.getX()));
                    if (point1.getX() < point2.getX())
                        angle *= -1;
                    if (point1.getX() > point2.getX())
                        angle = Math.PI - angle;
                    //angle = makeRadiansPositive(angle);
                    if (minAngle == -1) {
                        minAngle = angle;
                        maxAngle = angle;
                        minPoint = point2;
                        maxPoint = point2;
                    }
                    double minDifference = makeRadiansPositive(angle - minAngle) - Math.PI;
                    double maxDifference = makeRadiansPositive(angle - maxAngle) - Math.PI;
                    if (minDifference < 0 && maxDifference < 0) {
                        minAngle = angle;
                        minPoint = point2;
                    }
                    if (minDifference > 0 && maxDifference > 0) {
                        maxAngle = angle;
                        maxPoint = point2;
                    }
                    if (minDifference < 0 && maxDifference > 0) {
                        edge = false;
                    }
                    System.out.println((point1.getX() - point2.getX()) + " " + (point1.getY() - point2.getY()) + " " + Math.toDegrees(angle));
                }
            }
            if (edge) {
                lines.add(new Line(point1, minPoint));
                lines.add(new Line(point1, maxPoint));
            }
        }
        return lines;
    }

    public double makeRadiansPositive(double radians) {
        return (radians + 2 * Math.PI) % (2 * Math.PI);
    }
}