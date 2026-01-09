package week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String []args){
       ScienceStudent s2= new ScienceStudent(11,"beshish",30);
       ScienceStudent s1= new ScienceStudent(21,"swornim",70);
       System.out.println(s2.calculateResult());
       System.out.println(s1.calculateResult());
    }
}