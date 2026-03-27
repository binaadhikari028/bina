package week19;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class StudentForm extends JFrame
{
   public StudentForm()
   {
       setTitle("Student Registration");
       setSize(500, 350);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setLayout(new BorderLayout());
       // titel pannel 
       JPanel titlePanel = new JPanel();
       JLabel title = new JLabel("Student Registraton Form");
       title.setFont(new Font("Arial", Font.BOLD, 18));
       titlePanel.add(title);
       // sidebar
       JPanel sidebar = new JPanel();
       sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
       String[] btnTxts = {"Add", "Edit", "Delete", "Update"};
       for (String text : btnTxts)
       {
           JButton btn = new JButton(text);
           btn.setMaximumSize(new Dimension(75, 40));
           sidebar.add(btn);
           sidebar.add(Box.createVerticalStrut(10));
           
       }
       
       add(titlePanel, BorderLayout.NORTH);
       add(sidebar, BorderLayout.WEST);
       setVisible(true);
   }
   public static void main(String[] args)
   {
       SwingUtilities.invokeLater( () -> 
       {
           new StudentForm();
       });
   }
}
