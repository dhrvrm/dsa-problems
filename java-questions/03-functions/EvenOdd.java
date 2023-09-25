import java.util.Scanner;

public class EvenOdd {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int num;
    System.out.print("Enter a numbers:");
    num = in.nextInt();

    isEven(num);
  }

  static void isEven(int num) {
    System.out.println(num % 2 == 0 ? "Even" : "Odd");
  }
}
