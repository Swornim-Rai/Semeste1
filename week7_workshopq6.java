
/**
 * Write a description of class week7_workshopq6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week7_workshopq6
{
    public static void main(String [] args){
        int [][] marks;
        marks=new int[2][2];
        marks[0][0]=40;
        marks[0][1]=30;
        marks[1][0]=50;
        marks[1][1]=80;
        System.out.println("English" +" "+"neplai");
        for(int i=0;i<marks.length;i++){
            for(int j=0; j<marks[i].length;j++){
                System.out.print(" " + " " + marks[i][j] + " ");    
            }
            System.out.println();
        }
    }
}