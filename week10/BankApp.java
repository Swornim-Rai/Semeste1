package week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String []args){
        SavingsAccount SA1= new SavingsAccount(011,"swornim",20000);
        CurrentAccount CA1=new CurrentAccount(011,"swornim",120000);
        
        System.out.println("your intrenst in Saving account you get is: " + SA1.calculateInterest());
        System.out.println("your intrenst in current  account you pay is: " + CA1.calculateInterest());
    }
}