package week9;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bike extends Vechicles
{
   String engineCapacity;
   
   public  bike(int vehicleId,String Brand,double BasePrice,String engineCapacity){
       super(vehicleId,Brand,BasePrice);
       this.engineCapacity=engineCapacity;
   }

    public double calculateFinalPrice(){
       double BasePrice=this.BasePrice;
       double taxPrice=BasePrice+((BasePrice/100)*10);
       double FinalPrice=BasePrice+taxPrice;
       
       return FinalPrice;
       
   }
   
}