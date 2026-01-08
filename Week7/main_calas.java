package Week7;


/**
 * Write a description of class main_calas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main_calas
{
    // Main class to test Result
    public static void main(String[] args) {
        // Creating two Result objects
        Result student1 = new Result(85, 78, 90);
        Result student2 = new Result(65, 72, 80);

        // Displaying results
        student1.displayResult();
        student2.displayResult();
    }
}