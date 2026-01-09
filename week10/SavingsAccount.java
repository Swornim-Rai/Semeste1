package week10;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account
{
    public SavingsAccount(int Account,String holderName,double balance){
        super(Account,holderName,balance);
    }
    
    @Override
    public double calculateInterest(){
        double intrest=super.calculateInterest();
        double ammount= getbalance();
        double IntrestAmmount= ammount + (ammount*0.1);
        return IntrestAmmount;
    }
    
    public double calculateInterest(int doubleRate){
        double intrest=super.calculateInterest();
        double ammount= getbalance();
        double IntrestAmmount= ammount + ((ammount/100)*doubleRate);
        return IntrestAmmount;
    }
    
    @Override
    public String toString(){ //toString  method
        return "Account Details ----> Account id: " + getAccount() + " Holder name: " + getholderName() + " Balance: " + getbalance();
    }
}