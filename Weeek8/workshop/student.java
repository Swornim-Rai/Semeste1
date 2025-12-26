package Weeek8.workshop;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
   private int id;
   private String name;
   private String address;
   private long phoneNumber;
   private String CollageName;
   
   public student(int id,String name,String address,long phoneN){
       this.id=id;
       this.name=name;
       this.address=address;
       this.phoneNumber=phoneN;
   }
   
   public void Displayinfo(){
       int ID=this.id;
       String Name=this.name;
       String Address=this.address;
       long PhoneN=this.phoneNumber;
       
       System.out.println("The id of this student is: " + ID);
       System.out.println("The Name of this student is: " + Name);
       System.out.println("The Address of this student is: " + Address);
       System.out.println("The Phone Number of this student is: " + PhoneN);
       
   }
}