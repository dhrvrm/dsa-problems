import java.util.Scanner;

public class Palindrome {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number:");
    int num = in.nextInt();
    System.out.println("Is " + num + " a Palindrome?: " + isPalindrome(num));
  }

  static boolean isPalindrome(int num) {
    int temp = num;
    int rev = 0, rem = 0;
    while (temp > 0) {
      rem = temp % 10;
      temp /= 10;
      rev = (rev * 10) + rem;
    }

    if (rev == num) {
      return true;
    }

    return false;
  }
}
