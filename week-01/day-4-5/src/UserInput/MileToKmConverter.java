package UserInput;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.print("How far you stay from A66?" + "(Please type the distance in miles):");
        Scanner s = new Scanner(System.in);

        double distanceInMiles = s.nextDouble();

        System.out.println("So you stay " + distanceInKm(distanceInMiles) + "km away from A66");
    }
    private static double distanceInKm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }
}
