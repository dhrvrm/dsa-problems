/*
Assigment Question
3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
*/

import java.util.Scanner;

public class SimpleInterest {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Principal Amount (in Rs.): ");
    float principal = input.nextFloat();
    System.out.print("Enter Interest Rate (in percentange): ");
    float rate = input.nextFloat();
    System.out.print("Enter Tenure (in years): ");
    float years = input.nextFloat();

    System.out.println(
      "Simple Interest: Rs." + (principal * rate * years) / 100
    );
  }
}
