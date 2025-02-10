package gr.aueb.cf.solutions.ch16.challenge2;

public class Circle extends AbstractShape implements IShape, ITwoDimensional {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }
}
