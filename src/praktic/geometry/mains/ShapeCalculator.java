/* Angeliani Junitaviana Herman - 245150700111021
                                                      
                                                ,dPYb,
                                                IP'`Yb
                                                I8  8I
                                                I8  8'
   ,gggg,gg   ,ggg,,ggg,     ,gggg,gg   ,ggg,   I8 dP 
  dP"  "Y8I  ,8" "8P" "8,   dP"  "Y8I  i8" "8i  I8dP  
 i8'    ,8I  I8   8I   8I  i8'    ,8I  I8, ,8I  I8P   
,d8,   ,d8b,,dP   8I   Yb,,d8,   ,d8I  `YbadP' ,d8b,_ 
P"Y8888P"`Y88P'   8I   `Y8P"Y8888P"888888P"Y8888P'"Y88
                                 ,d8I'                
                               ,dP'8I                 
                              ,8"  8I                 
                              I8   8I                 
                              `8, ,8I                 
                               `Y8P"                  
*/

package praktic.geometry.mains;

import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.*;
import java.util.Scanner;

// class utama yang menjalankan program dan meminta input user
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nama, nim
        System.out.println("\u001B[35m======================================");
        System.out.println("Shape Calculator");
        System.out.println("Angeliani Junitaviana Herman");
        System.out.println("245150700111021");
        System.out.println("======================================\u001B[0m");

        // input dan output untuk lingkaran
        System.out.println("2D Circle");
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("======================================");
        circle.printInfo();
        System.out.println("======================================");

        // input dan output untuk persegi
        System.out.println("2D Square");
        System.out.println("======================================");
        System.out.print("Enter side      : ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("======================================");
        square.printInfo();
        System.out.println("======================================");

        // input dan output untuk kubus yang bisa ditimbang    
        System.out.println("3D Weightable Cube");
        System.out.println("======================================");
        System.out.print("Enter edge      : ");
        double edge = scanner.nextDouble();
        System.out.print("Enter mass      : ");
        double massCube = scanner.nextDouble();
        Cube cube = new Cube(edge, massCube);
        System.out.println("======================================");
        cube.printInfo();
        System.out.println("======================================");

        // input dan output untuk bola yang bisa ditimbang
        System.out.println("3D Weightable Sphere");
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double radSphere = scanner.nextDouble();
        System.out.print("Enter mass      : ");
        double massSphere = scanner.nextDouble();
        Sphere sphere = new Sphere(radSphere, massSphere);
        System.out.println("======================================");
        sphere.printInfo();
        System.out.println("======================================");

        // bagian polymorphism dengan interface
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println("======================================");
        System.out.print("Enter edge      : ");
        double edgePoly = scanner.nextDouble();
        System.out.print("Enter radius    : ");
        double radiusPoly = scanner.nextDouble();
        System.out.print("Enter mass      : ");
        double massPoly = scanner.nextDouble();
        System.out.println("======================================");

        // menggunakan interface sebagai tipe data untuk polymorphism
        ThreeDimensional cubePoly = new Cube(edgePoly, massPoly);
        ThreeDimensional spherePoly = new Sphere(radiusPoly, massPoly);
        Weightable weightPoly = new Sphere(radiusPoly, massPoly);

        // menampilkan volume dan berat menggunakan interface 
        System.out.printf("Cube’s volume   : %.2f\n", cubePoly.getVolume());
        System.out.printf("Sphere’s volume : %.2f\n", spherePoly.getVolume());
        System.out.printf("Weight          : %.2f\n", weightPoly.getWeight());
        System.out.println("======================================");

        scanner.close();
    }
}
