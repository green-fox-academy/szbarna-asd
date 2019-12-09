package Conditionals;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Please type an integer number. Which number, it's up to you. :)");
        Scanner sc = new Scanner(System.in);

        int yourNumber = sc.nextInt();

        if (yourNumber % 2 == 0)  {
            System.out.println("The chosen number is even");
        } else {
            System.out.println("The chosen number is odd");
        }
    }
}
