package Week7;
import java.util.Scanner;

/**
 * Write a description of class bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bank
{
    int AccountNumber;
    String HolderName;
    double Balance;
    Scanner scan = new Scanner(System.in);
    public bank(int AccNumber,String Name,double Balance){
        this.AccountNumber=AccNumber;
        this.HolderName=Name;
        this.Balance=Balance;
    }
    
    void deposit(){
        System.out.println("pls enter the amount you need to deposit");
        int deposit=scan.nextInt();
        Balance+=deposit;
    }
    
    void Withdraw(){
        System.out.println("pls enter the amount you need to withdraw");
        int withdraw=scan.nextInt();
        Balance-=withdraw;
    }
    
    void CuBalance(){
         System.out.println("Your Current Balance is: " + Balance);
    }
}
