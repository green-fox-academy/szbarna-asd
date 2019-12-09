package Conditionals;

import java.util.Scanner;

public class PartyIndicatorBVersion {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) { //A program ellenőrzéséhez, hogy ne kelljen minden egyes új értéknél újraindítani a programot

            System.out.println("I heard you will have a party. :) How many girls will be present?");
            Scanner scanner = new Scanner(System.in); //egy programban elég egy scanner --> így Scanner scanner = new
            int numberOfGirls = scanner.nextInt();

            System.out.println("How many boys will be present?");
            int numberOfBoys = scanner.nextInt();

            if (numberOfGirls == 0) {
                System.out.println("Oh god! It's gonna be a sausage party... :(");  //kondíciók esetén figyelni a logikai sorrendre!!
            } else if ((numberOfBoys + numberOfGirls) < 20) {
                System.out.println("That's gonna be an average party... :|");
            } else if ((numberOfBoys + numberOfGirls) >=20 && (numberOfBoys != numberOfGirls)) {
                System.out.println("The party is gonna be quite cool! :)");
            } else if (numberOfBoys == numberOfGirls & (numberOfBoys + numberOfGirls) >= 20) {
                System.out.println("The party is gonna be excellent! ;)");
            }
        }

    }
}

