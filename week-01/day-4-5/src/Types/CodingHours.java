public class HelloOthers {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int workingDaysAWeekInTheSemester = 5;
        float workingHoursAWeek = 52;
        int codedHoursADAy = 6;
        float weeklyCodedHours = codedHoursADAy * 5;
        float averageCodingHoursPerc = (weeklyCodedHours / workingHoursAWeek) *100;
        System.out.println("The average coding hours percentage in a semester is: " + averageCodingHoursPerc + "%");
        }
}
