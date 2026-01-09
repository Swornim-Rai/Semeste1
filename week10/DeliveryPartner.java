package week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int  partnerId;
    private String name;
    private double basepay;
    
    public DeliveryPartner(int partnerId,String name,double basepay){
        this.partnerId=partnerId;
        this.name=name;
        this.basepay=basepay;
    }
    
    public void setPartnerID(int partnerId){
        this.partnerId=partnerId;
    }
    public int getPartnerId(){
        return this.partnerId;
    }
    
     public void setName(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }
    
     public void setBasePay(double BasePay){
        this.basepay=BasePay;
    }
    public double getBasePay(){
        return this.basepay;
    }
    
    public double calculatePayment(){
        return this.basepay;
    }
    
    @Override
    public String toString(){ //toString  method
        return "Person Details ----> person id: " + getPartnerId() + " name ID: " + getname() + " Basepay: " + getBasePay();
    }
}