package Week7;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
 String Brand;
 double Price;
   public Mobile(String Brand,double Price){
       this.Brand=Brand;
       this.Price=Price;
   }
   
  void isafforadable(){
      if(Price<20000){
          System.out.println("this Brand is affordable");
      }
      else{
          System.out.println("This brand is not afforable");
      }
      
  }
}