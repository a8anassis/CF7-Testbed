package gr.aueb.cf.ch14.model;

import java.util.Random;

public class PointSingleton {
    private int x;
    private int y;
    private static PointSingleton singleton = new PointSingleton();

    private PointSingleton() {

    }

    private PointSingleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static PointSingleton getInstance() {
        return singleton;
    }

    public static PointSingleton getRandomPoint() {
        Random random = new Random(System.nanoTime());
        return new PointSingleton(random.nextInt(10) + 1, random.nextInt(10) + 1);
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
