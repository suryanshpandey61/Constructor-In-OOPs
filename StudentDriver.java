import java.util.Scanner;
class StudentDriver
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     
     System.out.print("Enter the name of student:==");
     String name1=sc.nextLine();

     System.out.print("Enter the id of Student:==");
     int id1=sc.nextInt();

     System.out.print("Enter roll number:==");
     int rollno1= sc.nextInt();

     Student s1=new Student(name1,id1,rollno1);
  
     s1.showDetail();
     
     
   }
}