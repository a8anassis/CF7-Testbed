package gr.aueb.cf.ch14;

public class Point2D extends Point {
    private double y;

    public Point2D() {
        // super();     // By default, ως 1η εντολή καλεί ούτως ή άλλως
                        // τον default constructor της Point.
        // y = 0;       // By default, το y αρχικοποιείται στο 0. Οπότε
                        // δεν χρειάζεται σώμα στον default constructor.
    }

    public Point2D(double x, double y) {
        super(x);       // Καλεί ρητά τον overloaded constructor της Point.
                        // Ο overloaded constructor δεν καλείται by default.
                        // Αν δεν τον καλούσε, by default θα καλούσε τον
                        // default constructor της Point, όπως παραπάνω.
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        y += 10;
    }
}
