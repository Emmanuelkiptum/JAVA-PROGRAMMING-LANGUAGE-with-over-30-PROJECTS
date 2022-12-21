
package inheritance1;
import java.util.Scanner;
class Shape{
    
    Scanner scanner = new Scanner(System.in);
    
    String shape_A,shape_B;
    void get(){
System.out.println("Enter shape A:");
shape_A =scanner.next();
System.out.println("Enter shape B:");
shape_B =scanner.next();
  }
}

class Rectangle extends Shape{
    

 int length,width,R_area;
 void Rect_A(){
 System.out.println("Enter the length:");
length =scanner.nextInt();
System.out.println("Enter the width:");
width =scanner.nextInt();
R_area =length *width;
System.out.println("The area of a rectangle is:"+R_area);
 }
}
class Triangle extends Rectangle{
    

 int height,base,T_area;
 void Tri_A(){
 System.out.println("Enter the height:");
height =scanner.nextInt();
System.out.println("Enter the base:");
base =scanner.nextInt();
T_area =(height*base)/2;
System.out.println("The area of a Triangle is:"+T_area);
 }
}
public class inheritance1 {
    
    public static void main(String[] args) {
     Triangle tr = new Triangle();
     tr.get();
     tr.Rect_A();
     tr.Tri_A();
    }
    
}
