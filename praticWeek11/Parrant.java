package praticWeek11;


/**
 * Write a description of class Parrant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Parrant implements Notifacation 
{
    private int orderID;
    private double distanceInKM;
    private String PickupLocation;
    private String dropOffLocation;
    
    public Parrant(int orderID, double distanceInKM,String PickupLocation,String dropOffLocation)
    {
        this.orderID=orderID;
        this.distanceInKM=distanceInKM;
        this.PickupLocation=PickupLocation;
        this.dropOffLocation=dropOffLocation;
        
    }
    
    //calculate Charges,Time
    public double getDistance(){
        return this.distanceInKM;
    }
    public abstract double calculateCharges();
    public abstract double estamitetime();
    
    
}