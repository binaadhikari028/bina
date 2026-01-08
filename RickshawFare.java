import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();

        System.out.print("Is the customer local? (yes/no): ");
        String isLocal = sc.next();

        System.out.print("Is the travel during night? (yes/no): ");
        String isNight = sc.next();

        // Base fare calculation
        double fare = (distance * 20) + (time * 2);

        // Apply local discount using ternary operator
        fare = isLocal.equalsIgnoreCase("yes") ? fare * 0.9 : fare;

        // Apply night surcharge using ternary operator
        fare = isNight.equalsIgnoreCase("yes") ? fare * 1.2 : fare;

        // Display final fare in Nepali format
        System.out.println("Rs. " + Math.round(fare));

        sc.close();
    }
}