package Loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Please type an integer number! :)");
        Scanner first = new Scanner(System.in);

        int number1 = first.nextInt();

        System.out.println( "Please type an another integer number! :)");
        Scanner second = new Scanner(System.in);

        int number2 = second.nextInt();

        if (number1 >= number2) {
            System.out.println("The number should be bigger!");
        } else {
            for (int a = number1; a < number2; a++) {
                System.out.println(a);
            }
        }

    }
}
