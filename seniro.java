import java.util.Scanner;

public class seniro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter customer age: ");
        int age = sc.nextInt();

        
        System.out.print("Enter movie language (Nepali/Hindi/English): ");
        String language = sc.next().toLowerCase();

        
        System.out.print("Is the customer a student with valid ID? (yes/no): ");
        String student = sc.next().toLowerCase();

       
        System.out.print("Is today a festival day? (yes/no): ");
        String festival = sc.next().toLowerCase();

        double price = 0;

        if (age < 12) {
            price = 150; 
        } else if (age >= 60) {
            price = 200; 
        } else {
            price = 250; 
        }

       
        switch (language) {
            case "nepali":
                
                break;
            case "hindi":
                price += 50;
                break;
            case "english":
                price += 100;
                break;
            default:
                System.out.println("Invalid movie language!");
                sc.close();
                return;
        }


        if (student.equals("yes")) {
            price *= 0.8; 
        }
        if (festival.equals("yes")) {
            price *= 0.85;
        }

        System.out.println("Final ticket price: Rs. " + price);
        sc.close();
    }
}