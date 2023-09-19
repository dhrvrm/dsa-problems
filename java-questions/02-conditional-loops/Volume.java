/*
Assigment Question Basic
- Volume Of Cone
- Volume Of Prism
- Volume Of Cylinder
- Volume Of Sphere
- Volume Of Pyramid
*/

import java.util.Scanner;

public class Volume {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    volumeOfCone(15, 20);
    volumeOfPrism(82, 66);
    volumeOfCylinder(5, 23);
    volumeOfSphere(16);
    volumeOfPyramid(10, 5, 10);
  }

  static void volumeOfCone(double r, double height) {
    final double PI = 3.14;
    double volume = (PI * (r * r) * height) / 3;
    System.out.println("Volume Of Cone: " + volume);
  }

  static void volumeOfPrism(double base, double height) {
    double volume = base * height;
    System.out.println("Volume Of Prism: " + volume);
  }

  static void volumeOfCylinder(double r, double height) {
    final double PI = 3.14;
    double volume = PI * (r * r) * height;
    System.out.println("Volume Of Cylinder: " + volume);
  }

  static void volumeOfSphere(double r) {
    final double PI = 3.14;
    double volume = (4 * PI * (r * r * r)) / 3;
    System.out.println("Volume Of Sphere: " + volume);
  }

  static void volumeOfPyramid(double length, double width, double height) {
    double volume = (length * width * height) / 3;
    System.out.println("Volume Of Pyramid: " + volume);
  }
}
