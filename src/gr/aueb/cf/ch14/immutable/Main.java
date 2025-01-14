package gr.aueb.cf.ch14.immutable;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(5, 6);
        Point3D point3D = new Point3D(point, 8);
    }
}
