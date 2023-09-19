/*
Assigment Question Basic
- Perimeter Of Circle
- Perimeter Of Equilateral Triangle
- Perimeter Of Parallelogram
- Perimeter Of Rectangle
- Perimeter Of Square
- Perimeter Of Rhombus
*/

import java.util.Scanner;

public class Perimeter {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    perimeterOfCircle(5);
    perimeterOfEquilateralTriangle(5);
    perimeterOfParallelogram(10, 15);
    perimeterOfRectangle(10, 20);
    perimeterOfSquare(5);
    perimeterOfRhombus(25);
  }

  static void perimeterOfCircle(double r) {
    final double PI = 3.14;
    double perimeter = 2 * PI * r;
    System.out.println("Perimeter of Circle: " + perimeter);
  }

  static void perimeterOfEquilateralTriangle(double side) {
    double perimeter = 3 * side;
    System.out.println("Perimeter of Triangle: " + perimeter);
  }

  static void perimeterOfSquare(double side) {
    double perimeter = 4 * side;
    System.out.println("Perimeter of Square: " + perimeter);
  }

  static void perimeterOfRectangle(double length, double width) {
    double perimeter = 2 * (length + width);
    System.out.println("Perimeter of Rectangle: " + perimeter);
  }

  static void perimeterOfParallelogram(double height, double base) {
    double perimeter = 2 * (height + base);
    System.out.println("Perimeter of Parallelogram: " + perimeter);
  }

  static void perimeterOfRhombus(double side) {
    double perimeter = 4 * side;
    System.out.println("Perimeter of Rhombus: " + perimeter);
  }
}
