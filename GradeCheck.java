import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take numeric grade as input
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        // Use ternary operator to assign Pass/Fail
        String result = (grade >= 40) ? "Pass" : "Fail";

        // Display result
        System.out.println("Result: " + result);

        sc.close();
    }
}