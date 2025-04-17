package praktic.geometry.bases;

// class abstrak sebagai dasar untuk semua bentuk, menyimpan nama bentuk dan method printInfo abstrak
public abstract class Shape {
    // menyimpan nama bentuk
    protected String name;

    // konstruktor default yang memberikan nama default
    public Shape() {
        this.name = "Unnamed Shape";
    }

    // method untuk mengatur nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // method untuk mendapatkan nama bentuk
    public String getName() {
        return name;
    }

    // method abstrak yang harus diimplementasikan oleh class turunannya
    public abstract void printInfo();
}
