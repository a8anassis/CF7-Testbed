package gr.aueb.cf.ch12.model;

/**
 * Defines a 2-dimension point.
 */
public class Point {
    private static int noOfPoints = 0;
    private int x;
    private int y;

    public Point() {
        noOfPoints++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        noOfPoints++;
    }

    public static int getNoOfPoints() {
        return noOfPoints;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
