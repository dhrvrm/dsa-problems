import java.util.Scanner;

public class Factorial {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a non negative number:");
    int num = in.nextInt();
    System.out.println("Factorial of "+num+" is: " + factorial(num));
  }

  static int factorial(int num) {
    int fact = 1;

    if (num == 1 || num == 0) {
      return fact;
    }

    for (int counter = num; counter > 1; counter--) {
      fact *= counter;
    }
    return fact;
  }
}
