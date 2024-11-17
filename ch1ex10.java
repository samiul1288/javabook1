package samiuljava;

public class ch1ex10 {
    public static void main(String[] args) {
        // Distance in kilometers
        double dKm = 14;
        // Time in minutes and seconds
        int minutes = 45;
        int seconds = 30;
        // Convert time to hours
        double tHours = (minutes * 60 + seconds) / 3600.0;
        // Convert kilometers to miles (1 mile = 1.6 kilometers)
        double dM = dKm / 1.6;
        // Calculate average speed in miles per hour
        double averageSpeed = dM / tHours;
        // Display the result
        System.out.printf("The average speed is %.2f miles per hour.%n", averageSpeed);
    }
}

