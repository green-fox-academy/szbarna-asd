package UserInput;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String userName;

        System.out.println("Hello, User");
        System.out.println("What's your name?");

        userName = sc.nextLine();

        System.out.println("Your name is: " + userName);
    }
}
