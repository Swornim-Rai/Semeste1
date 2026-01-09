package week10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
     private int id;
    private String Name;
    //encaplusation also thgis is for the persson class 
    public  person(int id, String name){
        this.id=id;
        this.Name=name;
        
    }
    
    public void SetID(int NewID){ //setters
        this.id= NewID;
    }
    
    public int getID(){ //getters   
        return this.id;
    }
    
      
    public void SetName(String NewName){  //setters
        this.Name=NewName;
    }
    
    public String getName(){  //getters   
        return this.Name;
    }
    
    public double calculateSalary(){
        return 15000;
    }
    
    public void DisplayINFO(){   //to display info
        System.out.println("Name: " + getName());
        System.out.println("Name: " + getName());
    }
    
    @Override
    public String toString(){ //toString  method
        return "Person Details ----> person id: " + getID() + " Person ID: " + getName() ;
    }
}