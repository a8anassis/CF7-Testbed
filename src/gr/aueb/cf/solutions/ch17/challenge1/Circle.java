package gr.aueb.cf.solutions.ch17.challenge1;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape
        implements ITwoDimensional, Serializable, Cloneable {

    private final static long SerialVersionUID = 1L;

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        radius = circle.getRadius();
    }

    public static long getSerialVersionUID() {
        return SerialVersionUID;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
