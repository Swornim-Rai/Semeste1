package Weeek8.workshop;


/**
 * Write a description of class Bill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bill
{
    public static void main(String []args){
        ElectricityBill E1=new ElectricityBill("Swornim",300);
        
        E1.calculateBill();
        
    }
}