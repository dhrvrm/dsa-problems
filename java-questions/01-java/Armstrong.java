/*
Assigment Question
9. To find Armstrong Number between two given number.
*/

import java.util.Scanner;

public class Armstrong {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();
    int originalNum = num;
    int result = 0, remainder = 0;
    while (num > 0) {
      remainder = num % 10;
      result += remainder * remainder * remainder;
      num /= 10;
    }

    if (result == originalNum) {
      System.out.println("Armstrong");
    } else {
      System.out.println("Not a Armstrong");
    }
  }
}
