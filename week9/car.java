package week9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends Vechicles
{
   int numberOfDoors;
   String FuelType;
   
    public  car(int vehicleId,String Brand,double BasePrice,int numberOfDoors,String FuelType)
   {
       super(vehicleId,Brand,BasePrice);
       this.numberOfDoors=numberOfDoors;
       this.FuelType=FuelType;
       
   }
   
   public double calculateFinalPrice(){
       double BasePrice=this.BasePrice;
       double taxPrice=BasePrice+((BasePrice/100)*10);
       double FinalPrice=BasePrice+taxPrice+((BasePrice/100)*5);
       
       return FinalPrice;
       
   }
   
   
}