package week9;


/**
 * Write a description of class Vechicles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vechicles
{
   int vehicleId;
   String Brand;
   double BasePrice;
     
   public  Vechicles(int vehicleId,String Brand,double BasePrice){
       this.vehicleId=vehicleId;
       this.Brand=Brand;
       this.BasePrice=BasePrice;
   }
   
   public void displayVehicleInfo(){
       int Id=this.vehicleId;
       String Name=this.Brand;
       double Price=this.BasePrice;
       
       System.out.println("The VechiceID is: " + Id );
       System.out.println("The Brand of this Vechile is: " + Name);
       System.out.println("The price of the Vechile is: " + Price);
    }
   public void calculateTax(){
       double Price=this.BasePrice;
       double taxPrice = BasePrice+0.10*BasePrice;
       System.out.println("TaxPirce is: " + taxPrice);
       
   }
   
   public static void main(String []args){
       car c1= new car(001,"Honda",20000,4,"deseal");
       bike b1=new bike(002,"Yama",18000,"200km");
       
       c1.displayVehicleInfo();
       b1.displayVehicleInfo();
       System.out.println();
       
       c1.calculateTax();
       b1.calculateTax();
       System.out.println();
       
       c1.calculateFinalPrice();
       b1.calculateFinalPrice();
       
       
       
       
        
    }
}