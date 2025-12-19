import java.util.Scanner;
/**
 * Write a description of class week6_workshopq3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_workshopq3
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String name []={"Swornim","Adatya","Adarsh","Asus","Karun"};
        for(int i=0;i<name.length;i++){
           System.out.println(name[i]);
        }
        System.out.println();
        System.out.println(name[2]);
        System.out.println();
        System.out.println("enter a name to update the forth name: ");
        String newn=scan.nextLine();
        name[3]=newn;
        for(int i=0;i<name.length;i++){
           System.out.println(name[i]);
        }
        
    }
}