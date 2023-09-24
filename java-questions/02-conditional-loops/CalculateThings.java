/*
Assigment Question Basic
- Calculate Electricity Bill
- Calculate Average Of N Numbers
- Calculate Discount Of Product
- Calculate Distance Between Two Points
- Calculate Commission Percentage
- Calculate Depreciation of Value
- Calculate Batting Average
- Calculate CGPA Java Program
- Calculate Average 
- Calculate Power
- Calculate Compound Interest
- Calculate Sum Of N Numbers
- Calculate Future Investment Value
- Calculate LCM
- Calculate HCF

*/

import java.util.Scanner;

public class CalculateThings {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    // calculateElectrictyBill(167);
    // calculateAverage(new int[] { 2, 3, 5, 7 });
    // calculateDiscount(1000, 20f);
    // calculateDistance(3, 5, 5, 3);
    // calculateCommission(2000, 12.2f);
    // calculateDepriciation(110000, 10.0f);
    // calculateBattingAverage(350, 4);
    // calculateCGPA(80.0f);
    // calculateAverageMarks(new int[] { 45, 56, 49, 78, 68, 86, 31 });
    // calculatePower(2, 5);
    // calculateCompoundInterest(10000.0, 6.0, 4);
    // calculateSumOfN(new int[] { 45, 56, 49, 78, 68, 86, 31 });
    calculateCompoundInterest(40000.0, 7.0, 3);
  }

  static void calculateElectrictyBill(double units) {
    final double RATE = 8.06;
    double billPayable = 0;

    if (units > 0) {
      if (units < 200) {
        billPayable = units * (RATE);
      } else if (units > 200 && units < 400) {
        billPayable = units * (RATE * 1.2);
      } else if (units > 400) {
        billPayable = units * (RATE * 1.6);
      }
    }
    System.out.println("Bill Amount: Rs." + billPayable);
  }

  static void calculateAverage(int[] nums) {
    int sum = 0, average = 0;
    if (nums.length > 0) {
      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
      }
      average = sum / nums.length;
    }
    System.out.println("Average: " + average);
  }

  static void calculateDiscount(int amount, float percentage) {
    float dAmount = amount * ((100 - percentage) / 100);
    System.out.println(
      amount + " after " + percentage + "% Discount : " + dAmount
    );
  }

  static void calculateDistance(int x1, int y1, int x2, int y2) {
    System.out.println(
      "Distance Between Points " +
      Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0)
    );
  }

  static void calculateCommission(double amount, float percentage) {
    System.out.println(
      "Commition on sales of " +
      amount +
      " is: " +
      (amount * (percentage / 100))
    );
  }

  static void calculateDepriciation(double amount, float percentage) {
    System.out.println(
      "Depriciation on original value of " +
      amount +
      " is: " +
      (amount * (percentage / 100))
    );
  }

  static void calculateBattingAverage(int runScored, int timesOut) {
    System.out.println(
      "Batting Average of a player with " +
      runScored +
      " total run scored and out " +
      timesOut +
      " times is: " +
      (runScored / timesOut)
    );
  }

  static void calculateCGPA(float percentage) {
    final float RATE = 9.5f;
    System.out.println(
      "Percentage " + percentage + " % to CGPA is: " + (percentage / RATE)
    );
  }

  static void calculateAverageMarks(int[] marks) {
    int sum = 0;
    float average = 0f;
    if (marks.length > 0) {
      for (int i = 0; i < marks.length; i++) {
        sum += marks[i];
      }
      average = sum / marks.length;
    }
    System.out.println("Average Marks: " + average);
  }

  static void calculatePower(double num, int power) {
    double result = 1;
    for (int count = 0; count < power; count++) {
      result *= num;
    }
    System.out.println(num + " to the power of " + power + " is: " + result);
  }

  static void calculateCompoundInterest(
    double principal,
    double rate,
    int years
  ) {
    double interest = principal * (Math.pow((1 + rate / 100), years));
    System.out.println("Total After Compound Interest is: " + interest);
  }

  static void calculateSumOfN(int[] nums) {
    int sum = 0;
    if (nums.length > 0) {
      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
      }
    }
    System.out.println("Sum of N numbers: " + sum);
  }

  static void calculateFutureInvestmentValue(
    double investment,
    double rate,
    int years
  ) {
    double futureValue = investment * (Math.pow((1 + rate / 100), years));
    System.out.println("Projected Future Value is: " + futureValue);
  }
}
