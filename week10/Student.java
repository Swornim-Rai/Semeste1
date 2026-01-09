package week10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNo;
    private String name;
    private int marks;
    
    public Student(int rollNo,String name, int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    
     public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    
      public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }
    
      public void setmarks(int marks){
        this.rollNo=rollNo;
    }
    public int getmarks(){
        return this.marks;
    }
    
    public int  calculateResult(){
        return this.marks;
    }
    
    @Override
    public String toString(){ //toString  method
        return "student Details ----> Student id: " + getRollNo() + " Student name: " + getname() + " Marks: " + getmarks();
    }
}