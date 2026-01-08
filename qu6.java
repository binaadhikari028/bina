import java.util.Scanner;

public class qu6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter base fare (Rs): ");
        double baseFare = sc.nextDouble();

        System.out.print("Enter distance traveled (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter fare per km (Rs): ");
        double farePerKm = sc.nextDouble();

        System.out.print("Enter waiting time (in minutes): ");
        double waitingTime = sc.nextDouble();

        System.out.print("Enter waiting charge per minute (Rs): ");
        double waitingChargePerMin = sc.nextDouble();

        // Calculate total fare
        double distanceFare = distance * farePerKm;
        double waitingFare = waitingTime * waitingChargePerMin;
        double totalFare = baseFare + distanceFare + waitingFare;

        // Display result
        System.out.println("\n--- Rickshaw Fare Receipt ---");
        System.out.println("Base Fare: Rs " + baseFare);
        System.out.println("Distance Fare (" + distance + " km): Rs " + distanceFare);
        System.out.println("Waiting Fare (" + waitingTime + " min): Rs " + waitingFare);
        System.out.println("Total Fare: Rs " + totalFare);

        sc.close();
    }
}