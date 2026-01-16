package Week11;


/**
 * Write a description of class shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract  class shape implements Drawable2
{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public  void displayShapeInfo(){
      System.out.println("the area: " + calculateArea());
      System.out.println("the preameter: " + calculatePerimeter());
    }
    public void Draw(String Message){
        System.out.println("It is Drawing");
    }
}