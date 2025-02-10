package gr.aueb.cf.solutions.ch16.challenge2;


public class Rectangle extends AbstractShape implements IShape, ITwoDimensional {
    private double width;
    private double height;

    public Rectangle() {

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
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }
}
