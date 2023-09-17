import java.util.Scanner;

public class Prime {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();

    System.out.println("Is Prime? :" + isPrime(num));
  }

  static boolean isPrime(int num) {
    if (num > 1) {
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
}
