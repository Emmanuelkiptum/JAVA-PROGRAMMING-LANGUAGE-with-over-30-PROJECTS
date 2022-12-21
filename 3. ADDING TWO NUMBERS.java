
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        
  double a,b,sum; 
  
 Scanner scanner=new Scanner(System.in);
 
 System.out.println("Enter the first number:");
 a=scanner.nextDouble();
 System.out.println("Enter the second number:");
 b=scanner.nextDouble();
 
 sum=a+b;
 System.out.println("The SUM of the two values is:"+ sum);
    }   
}
