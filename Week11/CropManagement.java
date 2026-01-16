package Week11;


/**
 * Write a description of class CropManagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CropManagement
{
    public static void main(){
        Crop C1=new Rice("Rice","monsoon",100);
        Crop C2=new Wheat("Wheat","winter",120);
        Crop C3=new Maize("Maize","hill-friendly",80);
        
        C1.calculateTransportCost(5);
        C2.calculateTransportCost(10);
        C3.calculateTransportCost(30);
        
        C1.getTransportMethod();
        C2.getTransportMethod();
        C3.getTransportMethod();
        
        C1.displayCropInfo();
        C2.displayCropInfo();
        C3.displayCropInfo();
    }
}