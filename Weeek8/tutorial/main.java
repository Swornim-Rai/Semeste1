package Weeek8.tutorial;



public class main
{
    public static void main(String []args){
        //instance method 1- invocation of instance method >>> to call the instance method
        entity en=new entity(); //void + no parameter
        en.displayInfo();
        en.add(10,50);//actual parameters and it is used to make the method dimanic 
        en.add(20,40);
        
        
        //retuern type + para
        
        System.out.println(en.fixnum() + en.fixString());
        //or
        int FixNum= en.fixnum();
        System.out.print("the fixed number is:" + FixNum);
        
        //return type with para
        int mul= en.Multiply(20,2);
        System.out.println("multiplation of a and b is: " + mul);
        
        //static method +para
        en.Squar(20,30);
        
        //method ovelording
        
        //default constructoer 
        sample sm=new sample();
        //constructor overlording 
        sample sm1=new sample("red"); //color
        sample sm2=new sample(2000000); //price
        sample sm3=new sample("red",2000000); //both
        
    }
}