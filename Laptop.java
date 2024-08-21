class Laptop
{
  String name;
  int price;
  double weight;

  Laptop(String name,int price,double weight)
  {
    this.name=name;
    this.price=price;
    this.weight=weight;
  }

 public void showDetails() 
  {
    System.out.println("===================");
    System.out.println("Name of Laptop is :"+name);
    System.out.println("Id is :"+price);
    System.out.println("Weight is :"+weight);
    System.out.println("===================");
  
  }

}