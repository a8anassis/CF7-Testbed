package gr.aueb.cf.ch14;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String pointToString() {
        return "(" + x + ")";
    }

    public void movePlus10() {
        x += 10;
    }

    private void reset() {
        x = 0;
    }

    protected void movePlusOne() {
        x += 1;
    }
}
