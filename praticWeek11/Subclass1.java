package praticWeek11;


/**
 * Write a description of class Subclass1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Subclass1 extends Parrant implements Notifacation
{
    private static final double PER_KM_charg=40;
    private static final double PER_Min_charg=5;
    
    public Subclass1(int orderID, double distanceInKM,String PickupLocation,String dropOffLocation){
        super(orderID,distanceInKM,PickupLocation,dropOffLocation);
    }
    
    @Override
    public  double calculateCharges(){
        return super.getDistance()*PER_KM_charg;
    }
    
    @Override
    public  double estamitetime(){
        return super.getDistance()*PER_Min_charg;
    }
    
    @Override
    public void Notify(String message){
        System.out.println(message);
    }
    
    public double Display(){
        return this.calculateCharges();
    }
}