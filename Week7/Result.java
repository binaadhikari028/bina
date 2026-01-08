package Week7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    // Result class
    // Attributes for three subjects
    int subject1;
    int subject2;
    int subject3;

    // Constructor to initialize marks
    public Result(int s1, int s2, int s3) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }

    // Method to calculate total marks
    public int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        int total = calculateTotal();
        return (total / 300.0) * 100; // assuming each subject is out of 100
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Marks: Subject1 = " + subject1 + ", Subject2 = " + subject2 + ", Subject3 = " + subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-----------------------------");
    }
}