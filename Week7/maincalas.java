package Week7;


/**
 * Write a description of class maincalas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maincalas
{
    // Main class to test Mobile
    public static void main(String[] args) {
        // Creating three Mobile objects
        Mobile mobile1 = new Mobile("Samsung", 18000);
        Mobile mobile2 = new Mobile("Apple", 70000);
        Mobile mobile3 = new Mobile("Xiaomi", 15000);

        // Checking affordability
        System.out.println(mobile1.brand + " is affordable? " + mobile1.isAffordable());
        System.out.println(mobile2.brand + " is affordable? " + mobile2.isAffordable());
        System.out.println(mobile3.brand + " is affordable? " + mobile3.isAffordable());
    }
}