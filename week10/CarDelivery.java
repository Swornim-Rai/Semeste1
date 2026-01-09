package week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery  extends DeliveryPartner
{
    private double CarPrice=200;
    
    public CarDelivery(int partnerId,String name,double basepay ){
        super(partnerId,name,basepay);
        
    }
    
    
    @Override
     public double calculatePayment(){
        double BasePrice= super.calculatePayment();
        double CarPrice= this.CarPrice;
        double TotalCarPrice= BasePrice+CarPrice;
        return TotalCarPrice;
    }
     public double calculatePayment(int NumberofExtra){
        double BasePrice= super.calculatePayment();
        double CarPrice= this.CarPrice;
        double TotalCarPrice= BasePrice+(CarPrice*NumberofExtra);
        return TotalCarPrice;
    }
    
    @Override
    public String toString(){ //toString  method
        return "Person Details ----> person id: " + getPartnerId() + " Person name: " + getname() + " Carpay: " + calculatePayment();
    }
}