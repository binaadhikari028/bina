import java.util.Scanner;

public class week4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("Student has Passed");
        } else {
            System.out.println("Student has Failed");
        }
    }
}