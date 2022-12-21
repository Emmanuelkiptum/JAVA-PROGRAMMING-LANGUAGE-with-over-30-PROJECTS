import java.util.Scanner;
public class Area_and_Perimeters {

	public static void main(String[] args) {
		// Program to run Area and Perimeter of RECTANGLE,SQUARE,TRIANGLE and CIRCLE
		Scanner scanner = new Scanner(System.in);
		
		double pie = 3.142; 
		System.out.println("**************INSERTING INPUT VALUES**************\n");
		System.out.println("What is the LENGTH");
		int Length = scanner.nextInt();
		System.out.println("What is the WIDTH");
		int Width = scanner.nextInt();
		System.out.println("What is the HEIGHT");
		int Height = scanner.nextInt();
		System.out.println("What is the BASE");
		int Base = scanner.nextInt();
		System.out.println("What is the HYPOTHESIS A");
		int Hypothesis_A = scanner.nextInt();
		System.out.println("What is the HYPOTHESIS B");
		int Hypothesis_B = scanner.nextInt();
		System.out.println("What is the DIAMETER");
		int Diameter = scanner.nextInt();
		System.out.println("\n");
		double radius = Diameter/2;
		
		// Program to run Area of RECTANGLE,SQUARE,TRIANGLE and CIRCLE
		System.out.println("**************CALCULATING THE AREA OF THE SHAPES**************\n");
		int A_RECTANGLE = Length * Width;
		System.out.println("The Area of the RECTANGLE is :" + A_RECTANGLE);
		
		int A_SQUARE = Length * Length;
		System.out.println("The Area of the SQUARE is :" + A_SQUARE);
		
		int A_TRIANGLE =  (Base * Height)/2;
		System.out.println("The Area of the TRIANGLE is :" + A_TRIANGLE);
		
		double A_CIRCLE = pie * radius * radius;
		System.out.println("The Area of the CIRCLE is :" + A_CIRCLE);
		System.out.println("\n");
		
		
		// Program to run Perimeter of RECTANGLE,SQUARE,TRIANGLE and CIRCLE
		System.out.println("**************CALCULATING THE PERIMETER OF THE SHAPES**************\n");
		int P_RECTANGLE = 2 * Length + 2 * Width;
		System.out.println("The Perimeter of the RECTANGLE is :" + P_RECTANGLE);
		
		int P_SQUARE = 4 * Length;
		System.out.println("The Perimeter of the SQUARE is :" + P_SQUARE);
		
		int P_TRIANGLE = Hypothesis_A + Hypothesis_B + Base;
		System.out.println("The Perimeter of the TRIANGLE is :" + P_TRIANGLE);
		
		double P_CIRCLE = pie * Diameter + Diameter;
		System.out.println("The Perimeter of the CIRCLE is :" + P_CIRCLE);
		
        
	}

}
