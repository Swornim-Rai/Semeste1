package Week7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args)
    {
      //<className> Variable_Nmae= new ClassName();  
      // "." is inmportant
      Student s1= new Student();
      s1.CollegeID="np012937483";
      s1.Course="Computing";
      s1.age=17;
      
      //now to print 
      System.out.println(s1.CollegeID);
      System.out.println(s1.Course);
      System.out.println(s1.age);
      s1.study();     //here it will be used to show the behaviours/Methods of a certain class
      
      System.out.println(); //to make spacec in the output
      
      //now to make  another class/ entity
      Student s2= new Student();
      s2.CollegeID="np01293437483";
      s2.Course="CyberSecurity";
      s2.age=16;
      
      //now to print the s2
      System.out.println(s2.CollegeID);
      System.out.println(s2.Course);
      System.out.println(s2.age);
      s2.age();      //here it will be used to show the behaviours/Methods of a certain class
    
      //for construdter it can be done in one line like
      //Student s1= new Student("np9473938",18,"computing");
      //and for behabior we need to initaialize it will not be construct
      //Student s2= new Student("np9473938",17,"Cyberseccurtiy");
      
      
      //Another class Named car
      car c1= new car();
      c1.Model="electric hypercar";
      c1.Price=2000000;
      c1.Brand="Rimac Nevera";
      c1.MaxSpeed="0-100 km/h";
      
      
      System.out.println(); //to make spacec in the output
      
      //Q1 of workshop
      Book b1= new Book();
      b1.Author="SwornimRai";
      b1.Title="THE Time Gate";
      b1.Price=2000;
      
      System.out.println("The Author is: " + b1.Author);
      System.out.println("He has wrote the book " + b1.Title);
      System.out.println("Price: " + b1.Price);
      
      System.out.println(); //to make spacec in the output
      
      //Q2 of workshop
      Rectangle R1= new Rectangle();
      R1.Length=200;
      R1.Breath=300;
      
      System.out.println("The length of the rectangle is: " + R1.Length);
      System.out.println("The breath of the rectangle is: "+ R1.Breath);

      System.out.println(); //to make spacec in the output
      
      //Q3 of WorkSHop
      Employees E1= new Employees();
      E1.Id=100;
      E1.Name="SwornimRai";
      E1.Salary=35000;
      
      Employees E2= new Employees();
      E2.Id=200;
      E2.Name="AdatyaThaplia";
      E2.Salary=43000;
      
      System.out.println("The ID of the Emplyoess is: " + E1.Id);
      System.out.println("The Name of the Emplyoess is: " + E1.Name);
      System.out.println("The Salary of the Emplyoess is: " + E1.Salary);
      System.out.println(); //to make spacec in the output
      System.out.println("The ID of the second  Emplyoess is: " + E2.Id);
      System.out.println("The Name of the second Emplyoess is: " + E2.Name);
      System.out.println("The Salary of the second Emplyoess is: " + E2.Salary);
      System.out.println(); //to make spacec in the output
      if(E1.Salary>E2.Salary){
          System.out.print("THE employess " + E1.Name + " has the higest salary that is  " + E1.Salary );
      }
      else{
           System.out.print("THE employess " + E2.Name + " has the higest salary that is  " + E2.Salary );
      }
      
      System.out.println(); //to make spacec in the output
      
      //Q4 of workshop
      Laptop L1= new Laptop("ThickPad",4,15000);
      Laptop L2= new Laptop("Levno",8,35000);
      Laptop L3= new Laptop("Asus",16,150000);
      
      System.out.println("The Brand Name is: " + L1.Brand);
      System.out.println("The Amout of ram in this Laptop  is: " + L1.RAM);
      System.out.println("The Price is: " + L1.Price);
      System.out.println(); //to make spacec in the output
      System.out.println("The Brand Name is: " + L2.Brand);
      System.out.println("The Amout of ram in this Laptop  is: " + L2.RAM);
      System.out.println("The Price is: " + L2.Price);
      System.out.println(); //to make spacec in the output
      System.out.println("The Brand Name is: " + L3.Brand);
      System.out.println("The Amout of ram in this Laptop  is: " + L3.RAM);
      System.out.println("The Price is: " + L3.Price);
      System.out.println(); //to make spacec in the output
      if(L1.RAM>8){
         System.out.println("The laptop " + L1.Brand + " has ram of: " + L1.RAM);
      }
      else if(L2.RAM>8){
          System.out.println("The laptop " + L2.Brand + " has ram of: " + L2.RAM);
      }
      else if(L3.RAM>8){
          System.out.println("The laptop " + L3.Brand + " has ram of: " + L3.RAM);
      }
      
      System.out.println(); //to make spacec in the output
      
      //Q5 of workshop
      Mobile M1=new Mobile("Nokia",7000);
      Mobile M2=new Mobile("Apple",70000);
      Mobile M3=new Mobile("Samsung",19000);
      Mobile M4=new Mobile("Hawai",12000);
      
      M1.isafforadable();
      M2.isafforadable();
      M3.isafforadable();
      M4.isafforadable();
      
      System.out.println(); //to make spacec in the output
      
      //Q6 of WorkShop
      Result TR1=new Result(76,87,86,85,86,85);
      Result TR2=new Result(36,87,66,95,66,75);
      Result TR3=new Result(77,84,83,89,83,87);
      
      TR1.Percentage();
      TR2.Percentage();
      TR3.Percentage();
      
      TR1.Display();
      System.out.println(); //to make spacec in the output
      TR2.Display();
      System.out.println(); //to make spacec in the output
      TR3.Display();
      
      System.out.println(); //to make spacec in the output
      
      //Q7 that is seniro
      bank Bank1=new bank(1000,"SwornimRai",150000);
      bank Bank2=new bank(1000,"AdatyaThapli",450000);
      bank Bank3=new bank(1000,"AdarshRai",650000);
      bank Bank4=new bank(1000,"AyashBK",350000);
      
      Bank1.deposit();
      Bank1.Withdraw();
      Bank1.CuBalance();
      
      System.out.println(); //to make spacec in the output
      
      Bank1.deposit();
      Bank1.Withdraw();
      Bank1.CuBalance();
      
      System.out.println(); //to make spacec in the output
      
      Bank1.deposit();
      Bank1.Withdraw();
      Bank1.CuBalance();
    }
    
}