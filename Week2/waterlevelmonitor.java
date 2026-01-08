package Week2;


/**
 * Write a description of class waterlevelmonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class waterlevelmonitor
{
    public static void main(String[] args)
    {
        int waterlevel=950;
        System.out.println("Current Water level: " + waterlevel + "L");
        System.out.println(
            (waterlevel>=1000)? "WARNING: Water level has reached 1000L or more!": "Status: Normal"
        );
    }
}