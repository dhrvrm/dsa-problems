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
- Calculate Average Marks
*/

import java.util.Scanner;

public class CalculateThings {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    calculateElectrictyBill(167);
    calculateAverage(new int[] {2,3,5,7});
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
}
