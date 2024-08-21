import java.util.Scanner;
class LaptopDriver
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
   

    System.out.print("Enter the 1st name of Laptop ==");
    String name1=sc.nextLine();

    System.out.print("Enter the  id of Laptop ==");
    int id1=sc.nextInt();

    System.out.print("Enter weight ==");
    double weight1=sc.nextDouble();
    
    sc.nextLine();

    System.out.print("Enter the 2nd name of Laptop==");
    String name2=sc.nextLine();

    System.out.print("Enter the id of Laptop ==");
    int id2=sc.nextInt();

    System.out.print("Enter weight ==");
    double weight2=sc.nextDouble();

    Laptop l1=new Laptop(name1,id1,weight1);
    Laptop l2=new Laptop(name2,id2,weight2);
    l1.showDetails();
    l2.showDetails();
  }
}