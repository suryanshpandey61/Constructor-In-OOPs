import java.util.Scanner;
class VehicleDriver
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
      
     System.out.print("Name of car is==");
     String name1=sc.nextLine();
 
     System.out.print("Color of the car is==");
     String color1=sc.nextLine();

     System.out.print("Number of the car is:==");
     int number1=sc.nextInt();

     Vehicle v1=new Vehicle(name1,color1,number1);
     v1.getDetails();
     
     
   }
}