package praticWeek11;


/**
 * Write a description of class object here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class object
{
    public static void main(String []args){
          Parrant delivery=new Subclass1(100,20,"ithaari","joe");
          System.out.println(delivery.calculateCharges()); //dynamic methid dispatch
          delivery.Notify("Here is your delivery :)");
          
    }
}