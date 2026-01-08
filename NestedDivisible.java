import java.util.Scanner;

public class NestedDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println("The number is divisible by both 3 and 5");
            } else {
                System.out.println("The number is divisible by 3 but not by 5");
            }
        } else {
            System.out.println("The number is NOT divisible by 3");
        }
    }
}