public class Car{
  
    int no;
	String brand;
    String color;

  
  public Car(int no, String brand, String color){
    this.no=no;
    this.color=color;

  }
  
  public void display(){
    System.out.println("Car brand: "+no);
    System.out.println("Car Color: "+color);
  }
    
  public static void main(String[] args){
    Car c1= new Car(1,"TATA","White");
    c1.display();

	Car c2= new Car(2,"Toyato","Silver");
	c2.display();
    
  }
}