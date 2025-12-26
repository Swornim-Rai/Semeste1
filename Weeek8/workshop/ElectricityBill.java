package Weeek8.workshop;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String ConsumerName;
    private int UnitConsumed;
    
    public ElectricityBill(String Name,int Consumed){
        this.ConsumerName=Name;
        this.UnitConsumed=Consumed;
        
    }
    
    public void setUnit(int UnitConsumed){
        this.UnitConsumed=UnitConsumed;
    }
    public int getUnit(){
        return this.UnitConsumed;
    }
    
    public void calculateBill(){
        String Name=this.ConsumerName;
        int Unit=this.UnitConsumed;
        double billAmount = 0.0;

        if (Unit <= 100) {
            billAmount = Unit * 5;
        } else {
            billAmount = 100 * 5 + (Unit - 100) * 8;
        }
        
        System.out.println("the Bill amout is: " + billAmount); 
    
        
    }
}