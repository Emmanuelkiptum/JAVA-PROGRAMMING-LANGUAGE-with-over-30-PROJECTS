

import java.util.Scanner;

abstract class Shape{

    Scanner scanner = new Scanner(System.in);
    String color1,color2;
 abstract double area();
 
 public Shape(){
 System.out.println("This is an Abstract class Shape constructor:");
 }
 void colour(String color1,String color2){
 this.color1 = color1;
 this.color2 = color2;
 }
}
class Rectangle extends Shape{
    
 public Rectangle(){
 System.out.println("This is an Rectangle class constructor:");
 
 }
 double area(){
 System.out.println("Enter the length:");
 int length = scanner.nextInt();
 System.out.println("Enter the width:");
 int width = scanner.nextInt();
 int R_area = (length*width);
 System.out.println("The rectangle area is:"+ R_area);
 
 return R_area;
 }
}

class Triangle extends Shape{
    
 public Triangle(){
 System.out.println("This is an Triangle class constructor:");
 }
 
 double area(){
 System.out.println("Enter the height:");
 int height = scanner.nextInt();
 System.out.println("Enter the base:");
 int base = scanner.nextInt();
 int T_area = (height*base)/2;
 System.out.println("The Triangle area is:"+ T_area);
 
 return T_area;
 }
}
public class ABSTRACTION2 {
    
    public static void main(String[] args) {
     Shape sp;
     sp = new Rectangle();
     sp.colour("blue", "green");
     
     Rectangle rt;
     rt = new Rectangle();
     rt.area();
     
      Triangle tt;
     tt = new Triangle();
     tt.area();
    } 
}
