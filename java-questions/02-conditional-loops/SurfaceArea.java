/*
Assigment Question Basic
- Curved Surface Area Of Cylinder
- Total Surface Area Of Cube
*/

import java.util.Scanner;

public class SurfaceArea {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    curvedSurfaceAreaOfCylinder(5,2);
    totalSurfaceAreaOfCube(5);
  }

  static void curvedSurfaceAreaOfCylinder(double r, double height) {
    final double PI = 3.14;
    double surfaceArea = 2 * PI * r * height;
    System.out.println("Curved Surface Area Of Cylinder: " + surfaceArea);
  }

  static void totalSurfaceAreaOfCube(double side) {
    double surfaceArea = 6 * (side * side);
    System.out.println("Total Surface Area Of Cube: " + surfaceArea);
  }
}
