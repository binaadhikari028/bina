import java.util.Scanner;

public class GPAConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        
        // Check if input is numeric
        if (sc.hasNextDouble()) {
            double gpa = sc.nextDouble();

            // Validate GPA range
            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("Error: GPA must be between 0.0 and 4.0");
            } else {
                // Convert GPA to grade
                String grade;
                if (gpa >= 3.7) {
                    grade = "A";
                } else if (gpa >= 3.0) {
                    grade = "B";
                } else if (gpa >= 2.0) {
                    grade = "C";
                } else if (gpa >= 1.0) {
                    grade = "D";
                } else {
                    grade = "F";
                }
                System.out.println("Grade: " + grade);
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a numeric GPA.");
        }

        sc.close();
    }
}