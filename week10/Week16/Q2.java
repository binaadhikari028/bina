package week10.Week16;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String[] args)
    {
        String astring =(" String yrr ");
        int actualgt = astring.length();
        
        System.out.println("Length of string with space: " + actualgt);
        String astringg = astring.trim();
        int lengthwithoutspace = astringg.length();
        
        System.out.println("Length of the string after trial(): " + lengthwithoutspace);
        System.out.println("/nOriginal string: ' " + astring + " ' ");
        System.out.println("Trimmed string: ' " + astringg + " ' ");
        
        if(astring.length() >=10)
        {
            String firstTen = astring.substring(0,10);
            System.out.println("First 10 characters:" + firstTen);
        }
        else
        {
             System.out.println("String has more than 1o characters" + trimmed);
        }
        {
        
        }
    }
}