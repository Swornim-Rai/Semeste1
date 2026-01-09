package week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student
{
    public ManagementStudent(int rollNo,String name, int marks){
        super(rollNo,name,marks);
    }
    
    @Override
     public int calculateResult(){
        int marks= super.calculateResult();
        if(marks>60){
            System.out.print("you have passed with: ");
        }
        else{
           System.out.print("you have failed with: ");  
        }  
        return marks ;
    }
    
    public int calculateResult(int GrasceMarks){
        int marks= super.calculateResult();
        int Marks= marks+GrasceMarks;
        if(Marks>60){
            System.out.print("you have passed with: ");
        }
        else{
           System.out.print("you have failed with: ");  
        }  
        return Marks ;
    }
    
    @Override
    public String toString(){ //toString  method
        return "student Details ----> Student id: " + getRollNo() + " Student name: " + getname() + " Marks: " + getmarks();
    }
}