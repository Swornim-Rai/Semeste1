package Week11;


/**
 * Write a description of class Recctangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recctangle extends shape
{
    private int length;
    private int Breath;
    
    public Recctangle(int length, int Breath){
        this.length=length;
        this.Breath=Breath;
    }
    
    @Override
    public double calculateArea(){
        int L=this.length;
        int B=this.Breath;
        System.out.print("The Area is: ");
        return L*B;
    }
    
    @Override
    public  double calculatePerimeter(){
        int L=this.length;
        int B=this.Breath;
        System.out.print("The Premeter is: ");
        return (L+B)*2 ;
    }
    
    @Override
    public  void displayShapeInfo(){
        System.out.println("the area: " + calculateArea());
      System.out.println("the preameter: " + calculatePerimeter());
    }

    
    
}