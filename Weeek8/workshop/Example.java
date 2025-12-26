package Weeek8.workshop;


/**
 * Write a description of class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example
{
     public static void main(String []args){
        //student st1=new student();
        //st1.setName("Swornim");//this is set
        
        //String Name=st1.setName(); //can also store in a variable
        
        //System.out.println("this is the name: " + Name);
        //or 
        //System.out.println(st1.getName()); with out storing 
        
        setters_Getters st1=new setters_Getters("swornim",18);
        System.out.println(st1.getName());
        System.out.println(st1.getId());
        
        st1.setName("adatya");  //seetters help to update values as well
        st1.setId(16);
        
        System.out.println(st1.getName());
        System.out.println(st1.getId());
        
        st1.displayinfo();
        
    }
}