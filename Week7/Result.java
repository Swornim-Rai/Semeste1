package Week7;
import java.util.Scanner;

/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int English;
    int Math;
    int IP;
    int SSt;
    int Eco;
    int Acc;
    int Avg;
    public Result(int Eng,int Math,int IP,int SSt,int Eco,int Acc){
         this.English=Eng;
         this.Math=Math;
         this.IP=IP;
         this.SSt=SSt;
         this.Eco=Eco;
         
    }
    
    void Percentage(){
        Avg=(English+Math+IP+SSt+Eco+Acc)/6;
    }
    
    void Display(){
        System.out.println("The marks of English is " + English);
        System.out.println("The marks of math is " + Math);
        System.out.println("The marks of IP is " + IP);
        System.out.println("The marks of SSt is " + SSt);
        System.out.println("The marks of Eco is " + Eco);
        System.out.println("The marks of Acc is " + Acc);
        System.out.println("The marks of Avg is " + Avg+"%" );
    }
}