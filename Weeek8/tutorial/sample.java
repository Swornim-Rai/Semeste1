package Weeek8.tutorial;


/**
 * Write a description of class sample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sample
{
   //instance varialbe 
   //it will not work on static method / variable
   String color;
   double price;
   //constructor  overlording 
   //it is used so that if i need somethhing like if i need color i will only give color 
   public sample(){
       System.out.println("this is our default constructor. ");
   }
   
   public sample(String color){
       this.color=color;
   }
   
   public sample(double price){
       this.price=price;
   }
   
   public sample(String color,double price){
       this.color=color;
       this.price=price;
   }
}