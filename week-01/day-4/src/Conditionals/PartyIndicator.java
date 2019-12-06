package Conditionals;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) { //A program ellenőrzéséhez, hogy ne kelljen minden eyes új értéknél újraindítani a programot

            System.out.println("I heard you will have a party. :) How many girls will be present?");
            Scanner girls = new Scanner(System.in);
            int numberOfGirls = girls.nextInt();

            System.out.println("How many boys will be present?");
            Scanner boys = new Scanner(System.in);
            int numberOfBoys = boys.nextInt();

            if (numberOfBoys == numberOfGirls & (numberOfBoys + numberOfGirls) >= 20) {
                System.out.println("The party is gonna be excellent! ;)");
            } else if ((numberOfBoys + numberOfGirls) >=20 && (numberOfBoys != numberOfGirls)) {
                System.out.println("The party is gonna be quite cool! :)");
            } else if ((numberOfBoys + numberOfGirls) < 20) {
                System.out.println("That's gonna be an average party... :|");
            } else if (numberOfGirls <= 0) {
                System.out.println("Oh god! It's gonna be a sausage party... :(");
            }
        }

    }
}