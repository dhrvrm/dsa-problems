/*
Assigment Question
2. Take name as input and print a greeting message for that particular name.
*/

import java.util.Scanner;

public class Greetings {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.next();

    System.out.println("Namaste, " + name + "!");
  }
}
