package Weeek8.tutorial;


/**
 * Write a description of class entity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class entity
{
    //instance method --> void return type+ no params
    public void displayInfo(){
        System.out.println("Data");
    }
    
    //types of parameter >>formal paramater which is used to represent in methods
    //void retuen type + para
    public void add(int a, int b){
        System.out.println(a+b);
    }
    
    //return type+no para
    public int fixnum(){
        return 30; //it has to an integer of the retun type is int
    }
    
    public String fixString(){
        return "Yo";
    }
    
    //retun with para
    public int Multiply(int a , int b){
       return a*b;
    }
    
    //Static method --> return type + para
    public static  int Squar(int a , int b){
        return a*b*a*b;
    }
    
    //metod overlording 
    public void Add(int a, int b){
        System.out.println("the addtion of the tow is " + (a+b));
    }
    public void Add(double a, double b){
        System.out.println("the addtion of the tow is " + (a+b));
    }
    public void Add(int a, int b, int c){
        System.out.println("the addtion of the three is " + (a+b+c ));
    }
    public void Add(double a, double b, double c){
        System.out.println("the addtion of the three  is " + (a+b+c));
    }
    // number of paramet should be diffrent and  datatype it can also be used in return type methods
    
    
    
}