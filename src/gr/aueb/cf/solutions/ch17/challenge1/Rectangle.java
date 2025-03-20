package gr.aueb.cf.solutions.ch17.challenge1;


import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {
    private final static long SerialVersionUID = 1L;

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(Rectangle rectangle) {
        width = rectangle.getWidth();
        height = rectangle.getHeight();
    }

    public Rectangle(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
