import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance and time
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();

        // Ask if customer is local
        System.out.print("Is the customer local? (yes/no): ");
        String isLocal = sc.next().toLowerCase();

        // Ask if travel is during night
        System.out.print("Is the travel during night? (yes/no): ");
        String isNight = sc.next().toLowerCase();

        // Base fare calculation
        // Example rule: Rs. 20 per km + Rs. 2 per minute
        double fare = (distance * 20) + (time * 2);

        // Apply local discount (10% off if local)
        fare = (isLocal.equals("yes")) ? fare * 0.9 : fare;

        // Apply night charge (20% extra if night)
        fare = (isNight.equals("yes")) ? fare * 1.2 : fare;

        // Display final fare in Nepali format
        System.out.println("Rs. " + Math.round(fare));

        sc.close();
    }
}