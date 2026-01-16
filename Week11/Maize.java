package Week11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop
{
    public Maize(String cropName,String season,int landArea){
        super(cropName,season,landArea);
    }
    
    @Override 
    public  double calculateYield(){
        int OneArea=100;
        System.out.print("The total Yeald is: ");
        return getlandArea()*OneArea;
    }
    @Override
    public  String calculateWaterRequirement(){
        return " low water requirement";
    }
    @Override
    public void calculateTransportCost(int KM){
        int CostPerKM=50;
        System.out.println("THe total Cost is: " + KM*CostPerKM);
    }
    public void calculateTransportCost(int KM,String  rural){
        int CostPerKM=30;
        System.out.println("THe total Cost is: " + KM*CostPerKM);
    }
    @Override
    public void getTransportMethod(){
        System.out.println("Tractor");
    }
    public void displayCropInfo(){
        System.out.println("The total yield: " + calculateYield());
        System.out.println("The total yield: " + calculateWaterRequirement());
    }  
}