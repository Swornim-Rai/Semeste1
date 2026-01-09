package week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends person
{
    private String Specialization;
    private double Fee;
    //this is for the docter
    public Doctor(int id,String name,String Specialization, double Fee) //in child class you need to have the parant class attributes as well 
    {
        super(id,name); //in child class we need super() at first always where the attributs of the parant class
        this.Specialization=Specialization;
        this.Fee=Fee;
        
    }
    //you also need getters and setters as well
    
    @Override   //the method has to been on paraint class
    public double calculateSalary(){
        double BaseFee= super.calculateSalary();
        double NormalPayment= BaseFee + (this.Fee * 30);
        return NormalPayment;
    }
    
    //method Overloading , emthod is the same but the parameters are diffrent
    public double calculateSalary(int EmergamcyCase){
        double NormalPayment=this.calculateSalary();
        double PerEmergamcyCase= 1000;
        double EmergamcyBonus= EmergamcyCase*PerEmergamcyCase;
        return NormalPayment + EmergamcyBonus;
    }
    
    
    public void displayDetails(){
        //System.out.println(super.getID());
        //System.out.println(super.getName());
        //or
        super.DisplayINFO();
        
        System.out.println("Specialization: " + this.Specialization);
        System.out.println("Fee: " + this.Fee);
        System.out.println("Normal Payment of doucter: " + this.calculateSalary());
        
    }
    
    //or 
    
    @Override
    public String toString(){ //toString  method
        return "Person Details ----> person id: " + getID() + " Person ID: " + getName() + " Specialization: " + this.Specialization;
    }
}