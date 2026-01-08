package Week7;


/**
 * Write a description of class main_class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main_class
{
    public static void main(String[] args)
    {
        // Creating three Employee objects
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Bina";
        e1.salary = 25000;

        Employee e2 = new Employee();
        e2.id = 102;
        e2.name = "anwesha";
        e2.salary = 30000;

        Employee e3 = new Employee();
        e3.id = 103;
        e3.name = "Rashmi";
        e3.salary = 28000;

        // Displaying employee details
        System.out.println("Employee 1: " + e1.id + " " + e1.name + " " + e1.salary);
        System.out.println("Employee 2: " + e2.id + " " + e2.name + " " + e2.salary);
        System.out.println("Employee 3: " + e3.id + " " + e3.name + " " + e3.salary);

        // Finding employee with highest salary
        Employee highest = e1;

        if(e2.salary > highest.salary)
            highest = e2;

        if(e3.salary > highest.salary)
            highest = e3;

        // Displaying highest salary employee
        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("ID = " + highest.id);
        System.out.println("Name = " + highest.name);
        System.out.println("Salary = " + highest.salary);
    }
}