package week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder  extends Order
{
     public PremiumOrder(int orderId,String customerName, double amount){
        super(orderId,customerName,amount);
    }
    
    @Override
    public double calculateFinalAmount(){
        double Ammount= super.calculateFinalAmount();
        return Ammount*0.75;
    }
    
    public double calculateFinalAmount(double discountAmount ){
        double Ammount1= super.calculateFinalAmount();
        double Ammount= (Ammount1*discountAmount)/100;
        return Ammount;
    }
    
    @Override
    public String toString(){ //toString  method
        return "Coustmers Details ----> Oder id: " + getorderIdo() + " Coustemer name: " + getcustomerName() + " price: " + getamount();
    }
}