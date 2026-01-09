package week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    public static void main(String []args){
        NormalOrder N1=new NormalOrder(001,"Adatya",1200);
        PremiumOrder P1=new PremiumOrder(001,"Adarsh",2200);
        
        System.out.println(N1);
        System.out.println(P1);
        
        System.out.println("Normal Oders " + N1.calculateFinalAmount());
        System.out.println("Premium Oders " + P1.calculateFinalAmount());
        
    }
}