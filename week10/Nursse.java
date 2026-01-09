package week10;


/**
 * Write a description of class Nursse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nursse extends person
{
    private String Shift;
    private int extraAllowance;
    
    public Nursse(int id,String name,String Shift,int extraAllowance)
    {
        super(id,name); 
        this.Shift=Shift;
        this.extraAllowance=extraAllowance;
        
        
    }
    
    @Override   //the method has to been on paraint class
    public double calculateSalary(){
        double BaseFee= super.calculateSalary();
        double extraAll= this.extraAllowance;
        double NormalPayment= BaseFee + extraAll;
        return NormalPayment;
    }
    
}