
/**
 * Write a description of class Week6_seneiro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week6_seneiro
{
    public static void main(String [] args){
        String [] catagory={"fiction","Anime"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];
        titles[0][0] = "The Minecraft Movie - 5";
        prices[0][0] = 450.0;
        titles[1][0] = "Jojo"; 
        prices[1][0] = 850.50;
        for(int i = 0; i < catagory.length; i++){
            System.out.println("Category: " + catagory[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.println("Price: "+ prices[i][0]);
            System.out.println();
        }
    }
}