package Loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("Please type an integer number! :)");
        Scanner sc = new Scanner(System.in);

        int theNumber = sc.nextInt();

        for (int a = 1; a <=10; a++) {
            System.out.println(a + "*" + theNumber + "=" + a * theNumber);
        }
    }
}
