package Functions;

import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        System.out.println("Please type an integer number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(sum(input));
    }
    public static int sum(int input) {
        int result = 0;
        for (int i = 1; i < input + 1; i++) {
            result = result + i;
        }

        return result; //returnél fent soutolunk
    }
}
