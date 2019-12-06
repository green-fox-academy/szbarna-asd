package Loops;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please type an integer number. Which number, it's up to you. :)");
        Scanner sc = new Scanner(System.in);
        int yourNumber = sc.nextInt();

        for (int i = 0; i < yourNumber; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
