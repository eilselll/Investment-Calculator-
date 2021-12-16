// Leslie C B Band 11/14/2021 Chap 6 Q7 A and B 
import java.util.*;
public class Main {
  public static void main(String[] args) {
    double principal; // declaring each variable (there will be four)
    double rate;
    double time;
    double interest;

    Scanner Keyboard = new Scanner(System.in);
    System.out.println("\nEnter a principal amount: "); // prompt  user to enter the investment principal
    principal = Keyboard.nextDouble();
    System.out.println("Enter annual interest rate as a decimal: "); // prompt the user to enter an interest rate
    rate = Keyboard.nextDouble();
    System.out.println("Enter a time: "); // prompt the user to enter a time/year
    time = Keyboard.nextDouble();
    if (rate > 1) // if statement for a condition (rate has to be less then 1)
    {
      interest = (principal * rate / 100 * time);
      System.out.println("The simple interest you will have is " + interest);
      // if condition is met this line will be executed 
    } else {
      System.out.println("ERROR: Insufficient Numbers");
      // if not an error code will be displayed due user input issues
    }
  }
}