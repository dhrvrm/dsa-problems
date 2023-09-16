/*
Assigment Question
4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
*/

import java.util.Scanner;

public class SimpleCalculation {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    float num1 = input.nextFloat();
    System.out.print("Enter second number: ");
    float num2 = input.nextFloat();
    System.out.print("Enter Operation (+,-,*,/): ");
    char operation = input.next().charAt(0);

    float ans = 0;

    if (operation == '+') {
      ans = num1 + num2;
    } else if (operation == '-') {
      ans = num1 - num2;
    } else if (operation == '*') {
      ans = num1 * num2;
    } else if (operation == '/') {
      if (num2 == 0) {
        ans = 0;
      } else {
        ans = num1 / num2;
      }
    } else {
      System.out.println("Invalid Operation");
    }

    System.out.println("Result: " + ans);
  }
}
