package Week7;


/**
 * Write a description of class meinclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class meinclass
{
    // Main class to test BankAccount
    public static void main(String[] args) {
        // Creating two bank accounts
        BankAccount customer1 = new BankAccount(101, "Alice", 5000);
        BankAccount customer2 = new BankAccount(102, "Bob", 10000);

        // Display initial info
        customer1.displayAccountInfo();
        customer2.displayAccountInfo();

        // Perform some operations
        customer1.deposit(2000);
        customer1.withdraw(1000);
        customer1.displayAccountInfo();

        customer2.withdraw(12000); // should show insufficient balance
        customer2.deposit(5000);
        customer2.displayAccountInfo();
    }
}