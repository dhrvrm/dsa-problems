import java.util.Scanner;

public class Circle {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter radius:");
    double radius = in.nextDouble();
    System.out.println("Area of Circle: " + areaOfCircle(radius));
    System.out.println("Perimeter of Circle: " + perimeterOfCircle(radius));

  }

  static double perimeterOfCircle(double r) {
    final double PI = 3.14;
    double perimeter = 2 * PI * r;
    return perimeter;
  }

  static double areaOfCircle(double r) {
    final double PI = 3.14;
    double area = PI * (r * r);
    return area;
  }
}
