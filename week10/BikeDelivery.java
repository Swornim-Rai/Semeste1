package week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    private double BikePrice=150;
    
    public BikeDelivery(int partnerId,String name,double basepay){
        super(partnerId,name,basepay);
        
    }
    
    @Override
     public double calculatePayment(){
        double BasePrice= super.calculatePayment();
        double BikePrice= this.BikePrice;
        double TotalBikePrice= BasePrice+BikePrice;
        return TotalBikePrice;
    }
    
    @Override
    public String toString(){ //toString  method
        return "Person Details ----> person id: " + getPartnerId() + " Person name: " + getname() + " Bikepay: " + calculatePayment();
    }
}