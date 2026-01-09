package week10;


/**
 * Write a description of class sserive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sserive
{
    public static void main(String []args){
        DeliveryPartner DV1= new DeliveryPartner(100,"Swornim",100);
        System.out.println(DV1);
    
        BikeDelivery B=new BikeDelivery(200,"adatya",100);
        System.out.println(B);
            
        CarDelivery C=new CarDelivery(300,"Adarsh",100);
        System.out.println(C);
        
    }
}