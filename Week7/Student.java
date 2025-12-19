package Week7;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
   //attributs or proporiteies
    String CollegeID;
    int age;
    String Course;
    
    //public Student(String ID, int agr, String Cour) it is a constructer it will be the first and can not be in the middle of a void first construct
     //attributs
    //{
    //   this.CollegeID= ID; //this.College="np9473938" 
    //   this.age=agr;
    //  this.Course=Cour;
   // }
   //it helps to do it on one line
    
    //behaviours or methodes
    
    //for now we use "void" that is used to generally used to print at week 8 we will learn about other
    
    
    void study()
    {
        System.out.println(CollegeID+ " is studing.");
    }
    
    void age()
    {
        System.out.println(age + " is the age of student");
    }
}