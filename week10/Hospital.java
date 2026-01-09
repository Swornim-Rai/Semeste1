package week10;


/**
 * Write a description of class Hospital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hospital
{
    public static void main(String []args){
        Doctor d1= new Doctor(100,"swornim","Head_Doctor",120000);
        
        System.out.println(d1.calculateSalary());
        System.out.println(d1.calculateSalary(5));
        
    }
}