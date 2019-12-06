package Loops;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please type an integer number. Which number, it's up to you. :)");
        Scanner sc = new Scanner(System.in);
        int yourNumber = sc.nextInt();

        for (int i = 0; i <= yourNumber; i++) { //nasty loop. a felső for loop felel a sorok számáért
            for (int j = 0; j < i; j++) {       //az alsó pedig a sorban lévő csillagok számáért
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
