import java.util.Scanner;
/**
 * Write a description of class week6_workshopq4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_workshopq4
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int marks []={10,20,30,40,50};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println("the Sum of the arrays is: " + sum);
        System.out.println();
        int avg=0;
        for(int i=0;i<marks.length;i++){
            avg+=marks[i];
        }
        System.out.println("the Sum of the arrays is: " + avg/marks.length);
        System.out.println();
        int max=marks[0];
        int min=marks[0];
        for(int i=0;i<marks.length;i++){
            if(max<marks[i]){
                max=marks[i];
            }
            else if(min>marks[i]){
                min=marks[i];
            }
        }
        System.out.println("the largest number is: " + max);
        System.out.println("the smallest number is: " +  min);
        System.out.println();
        System.out.println("pls enter the amout of number to store:");
        int store=scan.nextInt();
        int [] newMarks;
        newMarks= new int[store];
        for(int i=0;i<newMarks.length;i++){
            System.out.println("pls enter the number to store:");
            int num=scan.nextInt();
            newMarks[i]=num;
        }
        for(int i=0;i<newMarks.length;i++){
            System.out.println("the new set of arrays are: " + newMarks[i]);
        }
        
        
        
        
        
    }
}