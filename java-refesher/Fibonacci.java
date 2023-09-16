/*
Assigment Question
7. To calculate Fibonacci Series up to n numbers.
*/

import java.util.Scanner;

public class Fibonacci {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter fibonacci count: ");
    int count = input.nextInt();
    int result = 0, num1 = 0;
    int num2 = 1;

    if (count > 0) {
      System.out.print(num1 + "  ");
      System.out.print(num2 + "  ");
      for (int i = 0; i < count - 2; i++) {
        result = num1 + num2;
        num1 = num2;
        num2 = result;
        System.out.print(result + "  ");
      }
    }
  }
}
