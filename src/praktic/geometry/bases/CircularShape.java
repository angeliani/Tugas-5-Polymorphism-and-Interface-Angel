package praktic.geometry.bases;

// class abstrak yang mewarisi class shape dan digunakan sebagai dasar bentuk melingkar (lingkaran, bola)
public abstract class CircularShape extends Shape {
    // menyimpan nilai radius
    protected double radius;

    // konstanta untuk nilai pi (22/7)
    protected final int PI_NUMERATOR = 22; //pembilang nilai pi
    protected final int PI_DENOMINATOR = 7; //penyebut nilai pi

    // konstruktor default yang mengatur radius ke 0
    public CircularShape() {
        this.radius = 0;
    }

    // method untuk mengatur nilai radius
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // method untuk mendapatkan nilai radius
    public double getRadius() {
        return radius;
    }
}

