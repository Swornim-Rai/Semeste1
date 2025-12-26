package Weeek8.workshop;


/**
 * Write a description of class ShopingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShopingCart
{
    private String ItemName;
    private double ItemPrice;
    private int Quantity;
    
    public ShopingCart(String IN,double IP,int Q){
        this.ItemName=IN;
        this.ItemPrice=IP;
        this.Quantity=Q;
    }
    
    public void setQuantity(int Quantity){
        this.Quantity=Quantity;
    }
    public int getQuantity(){
        return this.Quantity;
    }
    
    public void CalculateTotal(){
        int Qnt=this.Quantity;
        double Price=this.ItemPrice;
        
        System.out.println("The total cost of the Items is: " + (Qnt*Price));
        
    }
    
    public void CalculateDiscountTotal(){
        int DiscountPercent= 20;
        int Qnt=this.Quantity;
        double Price=this.ItemPrice;
        System.out.println("The total cost of Discounted items(20%) is: " + ((Qnt*((Price/100)*20))));
        
    }
    
    public void DisplayCart(){
        String Name=this.ItemName;
        int Qnt=this.Quantity;
        double Price=this.ItemPrice;
        
        System.out.println("The name of the item is: " + Name);
        System.out.println("The Price of the item is: " + Price);
        System.out.println("The Quantity of the item is: " + Qnt);
    }
    
    
    
}