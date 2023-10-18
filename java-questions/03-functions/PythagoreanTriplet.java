import java.util.Scanner;

public class PythagoreanTriplet {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number:");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    System.out.println("Pythagorean Triplet? : " + isTriplet(a,b,c));
  }

  static boolean isTriplet(int a, int b, int c) {

    if ((a * a) + (b * b) == (c * c)) {
      return true;
    }

    return false;
  }
}
