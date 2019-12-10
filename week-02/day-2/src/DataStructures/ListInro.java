package DataStructures;


import java.util.ArrayList;


public class ListInro {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        for (String listOfNames : names) {    //for each loop kiírja az összes elementet
            System.out.println(listOfNames);
        }
        System.out.println("--------------------------");

        names.add("Amanda");
        names.add("John");
        System.out.println(names.size());//a lista mérete
        System.out.println("----------------------------");

        System.out.println(names.get(2)); //a második index
        for (String FullList : names) {
            System.out.println(FullList); //a módosított full lista
        }
        System.out.println("------------------------------");

        names.remove(2);
        for (String cuttedList : names) {
            System.out.println(cuttedList);
        }
        System.out.println("----------------------------");
        names.clear();
        System.out.println(names.size());

    }
}