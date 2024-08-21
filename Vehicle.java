class Vehicle
{
 String name;
 String color;
 int number;

 Vehicle(String name,String color,int number)
  {
    this.name=name;
    this.color=color;
    this.number=number;
  }
 
 public void getDetails()
 {
     System.out.println("=====================");
     System.out.println("Name of car is:"+name);
     System.out.println("color of car is:"+color);
     System.out.println("Number of car is:"+number);
     System.out.println("=====================");
 }


}