import java.util.Scanner;

public class MinMax {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int num1, num2, num3;
    System.out.print("Enter three numbers:");
    num1 = in.nextInt();
    num2 = in.nextInt();
    num3 = in.nextInt();

    int max = maxNum(num1, num2, num3);
    int min = minNum(num1, num2, num3);

    System.out.println("Max: " + max + "\nMin: " + min);
  }

  static int maxNum(int num1, int num2, int num3) {
    if (num1 > num2) {
      if (num1 > num3) {
        return num1;
      } else {
        return num3;
      }
    } else if (num3 > num1) {
      return num3;
    } else {
      return num2;
    }
  }

  static int minNum(int num1, int num2, int num3) {
    if (num1 < num2) {
      if (num1 < num3) {
        return num1;
      } else {
        return num3;
      }
    } else if (num3 < num1) {
      return num3;
    } else {
      return num2;
    }
  }
}
