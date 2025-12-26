package Weeek8.workshop;
import java.util.Scanner;

/**
 * Write a description of class BankInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankInfo
{
    public static void main(String []args){
       BankAccount A1= new BankAccount(35246,645200,"Adarsh");
       BankAccount A2=new BankAccount(3725,98646200,"Adatya");
       BankAccount A3=new BankAccount(2653,76736700,"Swornim");
        
       A3.getBalance();
       System.out.println();
       A2.deposit();
       System.out.println();
       A3.Withdraw();  
       
    }
}