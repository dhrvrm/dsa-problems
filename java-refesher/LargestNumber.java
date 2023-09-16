/*
Assigment Question
5. Take 2 numbers as input and print the largest number.
*/

import java.util.Scanner;

public class LargestNumber {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();
    
    int ans = num1>num2 ? num1 : num2;
    System.out.println("Largest Number: " + ans);
  }
}
