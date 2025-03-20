package gr.aueb.cf.solutions.ch17.challenge1;


import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements Cloneable, Serializable {

    private final static long SerialVersionUID = 1L;

    private double length;

    public Line() {}

    public Line(double length) {
        this.length = length;
    }

    public Line(Line line) {
        length = line.getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
