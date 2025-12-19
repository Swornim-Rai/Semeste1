
/**
 * Write a description of class week6_q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_q8
{
    public static void main(String [] args){
        String [][] marks;
        marks=new String[2][3];
        marks[0][0]="Swornim";
        marks[0][1]="Adarsh";
        marks[0][2]="Adatya";
        marks[1][0]=" ";
        marks[1][1]=" ";
        marks[1][2]=" ";
         for(int i=0;i<marks.length;i++){
            for(int j=0; j<marks[i].length;j++){
                System.out.println(" " + " " + marks[i][j] + " ");    
            }
            System.out.println();
        }
    }
}