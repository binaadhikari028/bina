import java.util.Scanner;

public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare variables
        float mp, sp;
        char category;

        // Input marked price
        System.out.print("Enter the marked price of the item: ");
        mp = sc.nextFloat();

        // Input category
        System.out.print("Enter the category of the item (A/B/C/D): ");
        category = sc.next().charAt(0);

        // Calculate selling price based on category
        if (category == 'A' || category == 'a') {
            sp = mp - (mp * 0.60f);   // 60% discount
        } else if (category == 'B' || category == 'b') {
            sp = mp - (mp * 0.40f);   // 40% discount
        } else if (category == 'C' || category == 'c') {
            sp = mp - (mp * 0.20f);   // 20% discount
        } else if (category == 'D' || category == 'd') {
            sp = mp - (mp * 0.10f);   // 10% discount
        } else {
            System.out.println("Invalid category entered!");
            sc.close();
            return;
        }

        // Output selling price
        System.out.println("Selling Price of the item: " + sp);

        sc.close();
    }
}