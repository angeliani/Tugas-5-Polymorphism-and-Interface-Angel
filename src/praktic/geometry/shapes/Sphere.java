package praktic.geometry.shapes;

import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.bases.CircularShape;

// class bola, turunan dari circularshape dan implementasi interface 3d serta weightable
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass;

    // konstruktor default
    public Sphere() {
        super();
        this.name = "Sphere";
        this.mass = 0;
    }

    // konstruktor dengan radius dan massa
    public Sphere(double radius, double mass) {
        this(radius);
        this.mass = mass;
    }

    // konstruktor hanya dengan radius
    public Sphere(double radius) {
        this();
        this.radius = radius;
    }

    // menghitung luas permukaan bola
    public double getSurfaceArea() {
        return 4 * (PI_NUMERATOR / (double) PI_DENOMINATOR) * radius * radius;
    }

    // menghitung volume bola
    public double getVolume() {
        return (4.0 / 3.0) * (PI_NUMERATOR / (double) PI_DENOMINATOR) * Math.pow(radius, 3);
    }

    // menghitung berat bola
    public double getWeight() {
        return mass * g;
    }

    // menampilkan informasi bola
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.printf("Surface area    : %.2f\n", getSurfaceArea());
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Weight          : %.2f\n", getWeight());
    }
}
