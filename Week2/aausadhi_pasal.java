package Week2;


/**
 * Write a description of class aausadhi_pasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class aausadhi_pasal
{
    public static void main(String[] args)
    {
        String m1Name="Paracetamol";
        double m1Price=10;
        int m1Stock=100;
        boolean m1Prescription=true;
        
        String m2Name="Pantocid";
        double m2Price=15;
        int m2Stock=30;
        boolean m2Prescription=true;
        
        String m3Name="Jufex Forte";
        double m3Price=200;
        int m3Stock=10;
        boolean m3Prescription=false;
        
        System.out.println("===========================================");
        System.out.println("    Report of the medicine inventory");
        System.out.println("=========================================\n");
        
        System.out.println("Medicine Name\tPrice(NPR)\tStock\tPrescription");
        System.out.println("--------------------------------------------");
        
        System.out.println(m1Name+"\t\t" + m1Price + "t\t" + m1Stock + "t\t" + (m1Prescription? "Yes" : "No"));
        System.out.println(m2Name+"\t\t" + m2Price + "t\t" + m2Stock + "t\t" + (m2Prescription? "Yes" : "No"));
        System.out.println(m3Name+"\t\t" + m3Price + "t\t" + m3Stock + "t\t" + (m3Prescription? "Yes" : "No"));
        
        System.out.println("\n===================================");
        System.out.println("     End of Report");
        System.out.println("====================================");

    
    }
}