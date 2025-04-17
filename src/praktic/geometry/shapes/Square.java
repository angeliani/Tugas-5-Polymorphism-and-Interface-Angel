package praktic.geometry.shapes;

import praktic.geometry.interfaces.TwoDimensional;
import praktic.geometry.bases.Shape;

// class persegi, turunan dari shape dan implementasi interface 2 dimensi
public class Square extends Shape implements TwoDimensional {
    private double side;

    // konstruktor default dengan sisi 0
    public Square() {
        this.name = "Square";
        this.side = 0;
    }

    // konstruktor dengan parameter sisi
    public Square(double side) {
        this();
        this.side = side;
    }

    // menghitung luas persegi
    public double getArea() {
        return side * side;
    }

    // menghitung keliling persegi
    public double getPerimeter() {
        return 4 * side;
    }

    // menampilkan informasi persegi
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.printf("Area            : %.2f\n", getArea());
        System.out.printf("Perimeter       : %.2f\n", getPerimeter());
    }
}
