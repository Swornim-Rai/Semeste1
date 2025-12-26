package Weeek8.workshop;
import java.util.Scanner;

/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int AccountNumber;
    private double Balance;
    private String Name;
    
    public BankAccount(int AN,double B,String Name){
        this.AccountNumber=AN;
        this.Balance=B;
        this.Name=Name;
    }
    
    public void getBalance(){
        double Balance=this.Balance;
        System.out.println("the ammount you have stored is: " + Balance);
    }
    
    public void deposit(){
      double Balance=this.Balance;
      Scanner scan = new Scanner(System.in);
      System.out.print("pls enter the amount you want to deposit: ");
      int Depo=scan.nextInt();
      System.out.println();
      Balance+=Depo;
      System.out.println("your new Balance is: " + Balance);
      
    }
    
    public void Withdraw(){
      double Balance=this.Balance;
      Scanner scan = new Scanner(System.in);
      System.out.print("pls enter the amount you want to withdraw: ");
      int with=scan.nextInt();
      if(with>Balance){
          System.out.println("Sorry the amount you wan to withdraw is more then your Balance");
      }
      else{
          System.out.println("Thnak you,The withdraw of " + with + "is complete and your current balance is: " + (Balance-with));
      
          
      }
    }
    
    public void Atm(){
        
    }
    
}