
/**
 * Write a description of class week6_tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_tutorial
{
    public static void main(String [] args){
         //its about arrays
         // syntax 
         //<datatype><refVarableNmae>[]={val1,val2,val3,...}; 
         //Step by step 
         int [] Ages; //declartion an array
         Ages= new int[5]; //construction of arrays, [5] is the number of elemants it can store
         System.out.println("the length of Ages: " + Ages.length); // to show its length like the numbers of elements
         //initializing an arrays
         Ages[0]=10; 
         Ages[1]=14;
         Ages[2]=16;
         Ages[3]=20;
         Ages[4]=30;
         // it will come an  error of you do "Ages[5]=40" it wwill come an error called "index out of bound" becasue it it made to store 5 elemets not 6
         
         //if you want to print a specific element in an array
         System.out.println("Travsing an array: " + Ages[1]); //if i want the age 14 
         System.out.println();// just to make space for undertading
         //now for the correct way to do arrays direct way 
         int[] Age={20,10,23,23,14,32,543,533};
         //now to print the hole arrays
         for(int i=0;i<Age.length;i+=1){
             System.out.println("the elemets with the index: " + i + " of the arrays are: " + Age[i]);
            }
         System.out.println();// just to make space for undertading 
         // for to reverse the output like form last to first
           for(int i=Age.length-1;i>=0;i-=1){
             System.out.println("the elemets with the index: " + i + " of the arrays are: " + Age[i]);
            }
         //Also rember that in arrays there is index just like python its the same like 0,1,2,3,4,..
         // Index ={0 ,1 ,2 ,3 ,4 ,5, 6, 7 };
         System.out.println();// just to make space for undertading 
         //step by step
         int[][] matrix;// declarning a 2d array
         matrix = new int[2][2];//cconstructing a 2d array
         //initaalizating
         matrix[0][0]=10;
         matrix[0][1]=10;
         matrix[1][0]=10;
         matrix[1][1]=10;
         // there is 2D arrays as well
         //    index=  {   0   ,       1,         2};
        //  innerindex={{0,1,2}   , {0,1,2}   ,{0,1,2};
        //     rows=index  ,   colom=the values inside the {}
         int TwoD [][]={{20,30,31},{11,12,13}};
         // int Twod[rows][colloms]={{collom0,collom1,collom2,..},{collo0,collom1,collom2,..}
         //it is represented as: 
          //         collom0  collom1  collom 2
        // row 0      20        30       31
        // row 1      11        12       13
        for(int i=0;i<TwoD.length;i++){
          System.out.println(TwoD[1]);
        }
        int TwoD1 [][]={{20,30},{11,12,13},{20,30,24,40}}; //it is called racked arrays that means diffrent length for that
        for(int i=0;i<TwoD1.length;i++){
          for(int j=0 ;j<TwoD1.length; j++){
             System.out.println(TwoD1[j]);
            }
        }
         
        
    }
}