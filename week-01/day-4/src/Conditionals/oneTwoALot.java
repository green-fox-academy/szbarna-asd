package Conditionals;

import java.util.Scanner;

public class oneTwoALot {
    public static void main(String[] args) {
        System.out.println("Please type an integer number. Which number, it's up to you. :)");
        Scanner sc = new Scanner(System.in);

        int yourNumber = sc.nextInt();

        if (yourNumber <= 0) {
            System.out.println("Not enough");
        } else if (yourNumber == 1) {
            System.out.println("One");
        } else if (yourNumber == 2) {
            System.out.println("Two");
        } else if (yourNumber >= 2) {
            System.out.println("A lot");
        }
    }
}
