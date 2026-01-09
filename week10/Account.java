package week10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private int Account;
    private String holderName;
    private double balance;
    
    public Account(int Account,String holderName,double balance){
        this.Account=Account;
        this.holderName=holderName;
        this.balance=balance;
    }
    
     public void setAccount(int Account){
        this.Account=Account;
    }
    public int getAccount(){
        return this.Account;
    }
    
     public void setholderName(String holderName){
        this.holderName=holderName;
    }
    public String getholderName(){
        return this.holderName;
    }
    
     public void setbalance(double balance){
        this.Account=Account;
    }
    public double getbalance(){
        return this.balance;
    }

    public double calculateInterest(){
        return 10;
    }
    
    
    @Override
    public String toString(){ //toString  method
        return "Account Details ----> Account id: " + getAccount() + " Holder name: " + getholderName() + " Balance: " + getbalance();
    }
}