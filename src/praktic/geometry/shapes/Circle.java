package praktic.geometry.shapes;

import praktic.geometry.interfaces.TwoDimensional;
import praktic.geometry.bases.CircularShape;

// class lingkaran, turunan dari circularshape dan implementasi interface 2 dimensi
public class Circle extends CircularShape implements TwoDimensional {

    // konstruktor default yang mengatur nama menjadi "Circle"
    public Circle() {
        super();
        this.name = "Circle";
    }

    // konstruktor dengan parameter radius
    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    // menghitung luas lingkaran
    public double getArea() {
        return (PI_NUMERATOR / (double) PI_DENOMINATOR) * radius * radius;
    }

    // menghitung keliling lingkaran
    public double getPerimeter() {
        return 2 * (PI_NUMERATOR / (double) PI_DENOMINATOR) * radius;
    }

    // menampilkan informasi lingkaran
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.printf("Area            : %.2f\n", getArea());
        System.out.printf("Perimeter       : %.2f\n", getPerimeter());
    }
}

