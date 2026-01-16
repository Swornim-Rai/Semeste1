package Week11;


/**
 * Write a description of class Circlee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circlee extends shape
{
    private double radius;
    
    public Circlee(double radius){
        this.radius=radius;
    }
    
    @Override
    public double calculateArea(){
        double R=this.radius;
        System.out.print("The Area is: ");
        return  3.14*(R*R);
    }
    
    @Override
    public double calculatePerimeter(){
        double R=this.radius;
        System.out.print("The Premeter is: ");
        return (2*3.14*R) ;
    }
    
    @Override
    public  void displayShapeInfo(){
      System.out.println("the area: " + calculateArea());
      System.out.println("the preameter: " + calculatePerimeter());
    }
}