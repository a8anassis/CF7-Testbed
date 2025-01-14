package gr.aueb.cf.ch14.composition;

/**
 * Composition & Forwarding
 */
public class Point2D {
    private Point point;
    private double y;

    public Point2D() {

    }

    public Point2D(Point point, double y) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "point=" + point +
                ", y=" + y +
                '}';
    }
}
