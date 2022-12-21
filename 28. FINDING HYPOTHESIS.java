import java.util.Scanner;
public class Hypothesis {

	public static void main(String[] args) {
		// Finding the Hypothesis of the Triangle
System.out.println("**************FINDING THE HYPOTHESIS VALUE IN A TRIANGLE**************\n");
      
Scanner scanner = new Scanner(System.in);

      double Height;
      double Base;
      
      System.out.println("Enter the Height Value:");
      Height = scanner.nextDouble();
      
      System.out.println("Enter the Base Value:");
      Base = scanner.nextDouble();
      
      double Hypothesis = Math.sqrt((Height * Height)+(Base * Base));
      System.out.println("The HYPOTHESIS VALUE is : " + Hypothesis + " cm");
      
      
      
	}

}
