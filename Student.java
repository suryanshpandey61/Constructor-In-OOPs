class Student
{
  String name;
  int id;
  int rollno;
  
 Student(String name,int id,int rollno){
    this.name=name;
    this.id=id;
    this.rollno=rollno;
 }
 
 public void showDetail(){
 System.out.println("================");
 System.out.println("Name of Student is :"+name);
 System.out.println("Id of the Student is :"+id);
 System.out.println("Roll number is :"+rollno);
 System.out.println("================");
}



}
