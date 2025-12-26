package Weeek8.workshop;


/**
 * Write a description of class setters_Getters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class setters_Getters
{
   //attributs
   private String name;
   private int id;
   //for private attributss we need to make getter and seetters
   //constructor
   public setters_Getters(String name, int id){
       this.name=name;
       this.id=id;
       
   }
   //getters and setters method
   //in setter there is no return type
   public void setName(String name){
       this.name=name;     //this is set 
   }
   public String getName(){
       return this.name; //this is get 
   }
   
   public void setId(int id){
       this.id=id;     //this is set 
   }
    public int getId(){
       return this.id; //this is get 
   }
   
   //mehthods
   
   public void displayinfo(){
       String Name=this.name;
       int Id=this.id;
       
       System.out.println("The name of the student is: " + Name);
       System.out.println("The id is: " + Id);
       
   }
}