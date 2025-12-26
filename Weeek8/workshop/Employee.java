package Weeek8.workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    double BasicSalary;
    
    public Employee(double basicS){
        this.BasicSalary=basicS;
    }
    
    public void CalculateGrossSalary(){
        double Bsalary=this.BasicSalary;
        
        System.out.println("The Gross Salary of the employee is: " + (Bsalary+((Bsalary/100)*20)) );
        
    }
}