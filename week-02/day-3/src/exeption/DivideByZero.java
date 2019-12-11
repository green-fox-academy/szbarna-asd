package exeption;

import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pleas give me a number: ");
    int divider = sc.nextInt();

    try { // Prevents the program breaking when attempting dividing by zero
      int result = 10 / divider; // If the input value for divisor was 0 it stops the try block
      System.out.println("The result is: " + result); // The program doesn't reach this line if the input was 0
    } catch (ArithmeticException e) {
      System.out.println("Fail! Arithmetic Exception. The number can't be zero."); // This line only runs if the input was 0
    }
  }
}
