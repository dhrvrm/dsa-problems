/*
Assigment Question
6. Input currency in rupees and output in USD.
*/

import java.util.Scanner;

public class InrUsd {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    final float RATE = 84.45f;
    System.out.print("Enter Amount (in INR): ");
    float inrAmount = input.nextFloat();
    float usdAmount = inrAmount / RATE;
    System.out.println("After Conversion: $" + usdAmount);
  }
}
