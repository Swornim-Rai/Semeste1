
/**
 * Write a description of class week6_workshopq2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_workshopq2
{
    public static void main(String [] args){
        int [][] matrix;
        matrix= new int[2][2];
        matrix[0][0]=10;
        matrix[0][1]=10;
        matrix[1][0]=10;
        matrix[1][1]=10;
        System.out.println(matrix.length);
        int TwoD1 [][]={{20,30},{11,12,13},{20,30,24,40}}; 
        for(int i=0;i<TwoD1.length;i++){
          for(int j=0 ;j<TwoD1[i].length; j++){
             System.out.println(TwoD1[i][j]);
            
            }
        }
        
    }
}