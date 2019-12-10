public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        String quotePart1 = quote.substring(0, quote.lastIndexOf("you expect"));
        String quotePart2 = quote.substring(quote.indexOf("expect"), quote.length());
        System.out.println(quotePart1 + "always takes longer " + quotePart2);
        System.out.println(quotePart1);
        System.out.println(quotePart2);
    }
}
