package Variables;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int oneDay = 24*60*60;
        int oneHour = 60*60;
        int oneMin =60;
        System.out.println(oneDay - (currentHours * oneHour + currentMinutes * oneMin + currentSeconds));
    }
}
