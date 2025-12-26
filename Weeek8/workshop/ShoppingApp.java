package Weeek8.workshop;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String []args){
        ShopingCart S1= new ShopingCart("Soap",50,5);
        ShopingCart S2= new ShopingCart("Socks",150,2);
        ShopingCart S3= new ShopingCart("Book",100,5);
        ShopingCart S4= new ShopingCart("Pen",10,20);
        
        S1.CalculateTotal();
        S2.CalculateTotal();
        S3.CalculateTotal();
        S4.CalculateTotal();
        
        S1.CalculateDiscountTotal();
        S2.CalculateDiscountTotal();
        S3.CalculateDiscountTotal();
        S4.CalculateDiscountTotal();
        
        S1.DisplayCart();
        S2.DisplayCart();
        S3.DisplayCart();
        S4.DisplayCart();
    }
}