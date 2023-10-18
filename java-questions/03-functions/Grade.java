import java.util.Scanner;

public class Grade {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter marks:");
    double marks = in.nextDouble();
    System.out.println("Grade: " + gradeFromMarks(marks));
  }

  static String gradeFromMarks(double marks) {
    if (marks > 40) {
      if (marks > 50) {
        if (marks > 60) {
          if (marks > 70) {
            if (marks > 80) {
              if (marks > 90 && marks <= 100) {
                return "AA";
              } else if (marks > 100) {
                return "Invalid Marks";
              }
              return "AB";
            }
            return "BB";
          }
          return "BC";
        }
        return "CD";
      }
      return "DD";
    }
    return "Fail";
  }
}
