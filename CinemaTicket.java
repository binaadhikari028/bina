import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie language (Nepali/Hindi/English): ");
        String language = sc.next().toLowerCase();
        System.out.print("Enter customer age: ");
        int age = sc.nextInt();
        System.out.print("Is the customer a student? (yes/no): ");
        String student = sc.next().toLowerCase();
        System.out.print("Is there a festival discount? (yes/no): ");
        String festival = sc.next().toLowerCase();
        double basePrice = 0;

        
        switch (language) {
            case "nepali":
                basePrice = 200;
                break;
            case "hindi":
                basePrice = 250;
                break;
            case "english":
                basePrice = 300;
                break;
            default:
                System.out.println("Invalid movie language!");
                sc.close();
                return;
        }
        if (age < 12) {
            basePrice *= 0.5; 
        } else if (age >= 60) {
            basePrice *= 0.7; 
        } 
        if (student.equals("yes")) {
            basePrice *= 0.9; 
        }
        if (festival.equals("yes")) {
            basePrice *= 0.8; 
        }

        System.out.println("Final ticket price: NPR " + basePrice);
        sc.close();
    }
}