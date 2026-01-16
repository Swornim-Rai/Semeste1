package Week11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop implements Transportable
{
    private String cropName;
    private String season;
    private int landArea;
    
    public Crop(String cropName,String season,int landArea){
        this.cropName=cropName;
        this.season=season;
        this.landArea=landArea;
    }
    
    public String  getCropName(){
        return this.cropName;
    }
    public String  getseason(){
        return this.season;
    }
    public int  getlandArea(){
        return this.landArea;
    }
    public abstract double calculateYield();
    public abstract String calculateWaterRequirement();
    
    public void calculateTransportCost(int KM){
        int CostPerKM=50;
        System.out.println("THe total Cost is: " + KM*CostPerKM);
    }
    public void getTransportMethod(){
        System.out.println("The method of transport is: Tractor");
    }
    
    public void displayCropInfo(){
        System.out.println("The total yield: " + calculateYield());
        System.out.println("The total yield: " + calculateWaterRequirement());
    }
}