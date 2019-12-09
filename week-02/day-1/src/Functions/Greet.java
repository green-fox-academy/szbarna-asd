package Functions;

public class Greet {
    public static void main(String[] args) {
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`
        String a1 = "Green Fox";
        greet(a1);
    }
    public static String greet(String a1) { /*a metód maga //megadjuk a functiont(a változó fajtája)*/
        String fullSentence = "Greetings dear, " + (a1);
        System.out.println(fullSentence);
        return fullSentence;
    }
}
