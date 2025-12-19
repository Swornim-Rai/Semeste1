import java.util.Scanner;
/**
 * Write a description of class week6_workshopq5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_workshopq5
{
    public static void main(String [] args){
       Scanner scan = new Scanner(System.in);
       String Dis []={"Kathmandu","Lalitpur","Bhaktapur","Jhapa","Sunsari"};
       for(int i=0;i<Dis.length;i++){
           System.out.println( (i+1) + "."+Dis[i]);
       }
        System.out.println("pls enter the number of district to  store:");
        int store=scan.nextInt();
        scan.nextLine();
        String [] newDis;
        newDis= new String[store];
        for(int i=0;i<newDis.length;i++){
            System.out.println("pls enter the name of the district  to store:");
            String num=scan.nextLine();
            newDis[i]=num;
        }
        for(int i=0;i<newDis.length;i++){
            System.out.println("the new set of arrays are: " + (i+1) +"."+ newDis[i]);
        }
    }
}