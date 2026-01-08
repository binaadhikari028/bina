package Week7;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    // Attributes
    String brand;
    int price;

    // Constructor
    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to check affordability
    public boolean isAffordable() {
        return price < 20000;
    }
}