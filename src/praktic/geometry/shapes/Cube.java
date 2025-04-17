package praktic.geometry.shapes;

import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.bases.Shape;

// class kubus, turunan dari shape dan implementasi interface 3d serta weightable
public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;
    private double mass;

    // konstruktor default dengan nilai 0
    public Cube() {
        this.name = "Cube";
        this.edge = 0;
        this.mass = 0;
    }

    // konstruktor dengan parameter edge dan massa
    public Cube(double edge, double mass) {
        this();
        this.edge = edge;
        this.mass = mass;
    }

    // menghitung luas permukaan kubus
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // menghitung volume kubus
    public double getVolume() {
        return edge * edge * edge;
    }

    // menghitung berat kubus
    public double getWeight() {
        return mass * g;
    }

    // menampilkan informasi kubus
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.printf("Surface area    : %.2f\n", getSurfaceArea());
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Weight          : %.2f\n", getWeight());
    }
}
