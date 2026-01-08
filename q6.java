import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for inputs
        System.out.print("Enter distance traveled (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter waiting time (in minutes): ");
        double waitingTime = sc.nextDouble();

        // Fare calculation logic
        double baseFare = 20.0; // minimum charge
        double perKmRate = 10.0; // charge per km
        double perMinuteRate = 2.0; // charge per waiting minute

        double totalFare = baseFare + (distance * perKmRate) + (waitingTime * perMinuteRate);

        // Output
        System.out.println("Final Rickshaw Fare: Rs. " + totalFare);

        sc.close();
    }
}