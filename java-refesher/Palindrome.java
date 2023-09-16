/*
Assigment Question
8. To find out whether the given String is Palindrome or not.
*/

import java.util.Scanner;

public class Palindrome {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = input.next().toLowerCase();
    String reword = "";
    for (int i = (word.length() - 1); i >= 0; i--) {
      reword += word.charAt(i);
    }

    if (reword.equals(word)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
}
