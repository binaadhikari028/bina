package week10;


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private int CourseId;
    private String CourseName;
    private double baseFee;
    
    public Course (int CourseId,String CourseName, double baseFee)
    {
        this.CourseId= CourseId;
        this.CourseName= CourseName;
        this.baseFee= baseFee;
    }
        
    public void setcourseId(int newId)
    {
        this.CourseId=newId;
    }
    
    public int getCourseId()
    {
        return this.CourseId;
    }
    
    public String getCourseName()
    {
        return this.CourseName;
    }
    
    protected double calculateFee()
    {
        return this.baseFee;
    }
    
    public void displayCourseDetails()
    {
        System.out.println("Course ID: "+ getCourseId());
        System.out.println("Course Name: "+ getCourseName ());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}