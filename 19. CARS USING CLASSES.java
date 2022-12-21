import java.util.Scanner;

class Car{
    String type ;
    String model;
    int year;
    String color;
    int price;
  
    void drop() {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the type of the Car:");
    String make = scanner.next();
    System.out.println("Enter the model of the Car:");
    String model = scanner.next();
    System.out.println("Enter the year of the Car:");
    int year = scanner.nextInt();
    System.out.println("Enter the color of the Car:");
    String color = scanner.next();
    System.out.println("Enter the price of the Car:");
    int price = scanner.nextInt();	
	}
void drive() {
		System.out.println("you drive the car:");
	}
void brake(){
		System.out.println("you step on the brakes:");
	}
}

public class CLASSES {
    public static void main(String[] args) {
        
        Car mycar = new Car();
                mycar.drop();
		mycar.brake();
                mycar.drive();
                
    }
    
}
