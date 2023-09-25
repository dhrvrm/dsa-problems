import java.util.Scanner;

public class Vote {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your age:");
    int age = in.nextInt();
    isEligible(age);
  }

  static void isEligible(int age) {
    if (age >= 18) {
      System.out.println("Eligble");
    } else {
      System.out.println("Not Eligble");
    }
  }
}
