
/**
 * Write a description of class week3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));   // Addition
        System.out.println("a - b = " + (a - b));   // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));   // Division
        System.out.println("a % b = " + (a % b));   // Modulus

    
        int x = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After post-increment, x = " + x);

        
        int y = 10;
        System.out.println("\nAssignment Operators:");
        System.out.println("y = " + y);
        y += 5; // y = y + 5
        System.out.println("y += 5 → " + y);
        y -= 3; // y = y - 3
        System.out.println("y -= 3 → " + y);
        y *= 2; // y = y * 2
        System.out.println("y *= 2 → " + y);
        y /= 4; // y = y / 4
        System.out.println("y /= 4 → " + y);
        y %= 3; // y = y % 3
        System.out.println("y %= 3 → " + y);

      
        int p = 7, q = 10;
        System.out.println("\nRelational Operators:");
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q → " + (p == q));
        System.out.println("p != q → " + (p != q));
        System.out.println("p > q → " + (p > q));
        System.out.println("p < q → " + (p < q));
        System.out.println("p >= q → " + (p >= q));
        System.out.println("p <= q → " + (p <= q));

       
        boolean cond1 = true, cond2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("cond1 = " + cond1 + ", cond2 = " + cond2);
        System.out.println("cond1 && cond2 → " + (cond1 && cond2)); // AND
        System.out.println("cond1 || cond2 → " + (cond1 || cond2)); // OR
        System.out.println("!cond1 → " + (!cond1));                 // NOT


        int number = -10;
        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println("\nTernary Operator:");
        System.out.println("number = " + number + " → " + result);
    }
}