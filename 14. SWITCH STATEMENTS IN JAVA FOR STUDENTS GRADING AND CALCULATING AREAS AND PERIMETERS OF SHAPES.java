import java.util.Scanner;
public class Switch_Statements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int option;
		do {
		// Switch Statement
		System.out.println("\n**************SWITCH STATEMENTS**************\n");
		
		System.out.println("\n"
				+ " 1. AREA AND PERIMETER OF SHAPES:\n"
				+ " 2. STUDENT GRADING AND AVERAGE:");
		
		System.out.println("\nEnter the Option you need:");
		 option = scanner.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("\n***************FINDING AREA AND PERIMETER OF SHAPES*************");
			System.out.println("\n"
					+ " 1. AREA OF THE SHAPES:\n"
					+ " 2. PERIMETER OF THE SHAPES:");
			System.out.println("\nEnter the Choice you need:");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("\n***************FINDING AREA OF THE SHAPES*************\n");
				
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
			break;
			
			case 2:
				System.out.println("\n***************FINDING PERIMETER OF THE SHAPES*************\n");
				
				double Pie = 3.142; 
				System.out.println("**************INSERTING INPUT VALUES**************\n");
				System.out.println("What is the LENGTH");
				int length = scanner.nextInt();
				System.out.println("What is the WIDTH");
				int width = scanner.nextInt();
				System.out.println("What is the HEIGHT");
				int height = scanner.nextInt();
				System.out.println("What is the BASE");
				int base = scanner.nextInt();
				System.out.println("What is the HYPOTHESIS A");
				int hypothesis_A = scanner.nextInt();
				System.out.println("What is the HYPOTHESIS B");
				int hypothesis_B = scanner.nextInt();
				System.out.println("What is the DIAMETER");
				int diameter = scanner.nextInt();
				System.out.println("\n");
			
				
				// Program to run Perimeter of RECTANGLE,SQUARE,TRIANGLE and CIRCLE
				System.out.println("**************CALCULATING THE PERIMETER OF THE SHAPES**************\n");
				int P_RECTANGLE = 2 * length + 2 * width;
				System.out.println("The Perimeter of the RECTANGLE is :" + P_RECTANGLE);
				
				int P_SQUARE = 4 * length;
				System.out.println("The Perimeter of the SQUARE is :" + P_SQUARE);
				
				int P_TRIANGLE = hypothesis_A + hypothesis_B + base;
				System.out.println("The Perimeter of the TRIANGLE is :" + P_TRIANGLE);
				
				double P_CIRCLE = Pie * diameter + diameter;
				System.out.println("The Perimeter of the CIRCLE is :" + P_CIRCLE);
					
			break;
			
			default:
				System.out.println("The Choice is invalid:\n");
			break;
			}
		break;
		
		case 2:
			System.out.println("**************ENTERING STUDENT PERSONAL DETAILS**************\n");
			
		System.out.println("Enter the Name of the Student:");
		String name = scanner.next();
		System.out.println("Enter the Registration Number of the Student:");
		int reg_no = scanner.nextInt();
		System.out.println("Enter the faculty of the Student:");
		String faculty = scanner.next();
		System.out.println("Enter the Year of Study of the Student:");
		int year = scanner.nextInt();
		
		System.out.println("\n**************ENTERING STUDENT PERSONAL DETAILS**************\n");
		
		System.out.println("The Student Name is:" + name);
		System.out.println("The Student Rgistration Number is:" + reg_no);
		System.out.println("The Student Faculty is:" + faculty);
		System.out.println("The Student Year of Study is:" + year);
		
		System.out.println("\n**************GRADING STUDENT MARKS**************\n");
		
		System.out.println("Enter English marks:");
		int English = scanner.nextInt();
		System.out.println("Enter Maths Marks:");
		int Maths = scanner.nextInt();
		System.out.println("Enter Kiswahili Marks:");
		int Kiswahili = scanner.nextInt();
		System.out.println("Enter Biology Marks:");
		int Biology = scanner.nextInt();
		System.out.println("Enter Chemistry Marks:");
		int Chemistry = scanner.nextInt();
		
		double Total_Marks = English + Maths + Kiswahili + Biology + Chemistry;
		double Average_Marks = Total_Marks/5;
		
		System.out.println("\nThe Total_Marks is: " + Total_Marks);
		System.out.println("The Average_Marks is: " + Average_Marks);
		
		//IF-ELSE STATEMENT
		System.out.println("\n**************STUDENT GRADE**************\n");
		
		if(Average_Marks>=70) {
			System.out.println("The Grade is an:  A");
		}
		

		else if(Average_Marks>=60 && Average_Marks<= 69) {
			System.out.println("The Grade is a:  B");
		}
		
		else if(Average_Marks>=50 && Average_Marks<= 59) {
			System.out.println("The Grade is a:  C");
		}
		
		else if(Average_Marks>=40 && Average_Marks<= 49) {
			System.out.println("The Grade is a:  D");
		}
		
		else  {
			System.out.println("The Grade is an:  E");
		}
		
		break;
		
		default:
			System.out.println("The Option is invalid:\n");
		break;
		}
		}while(option !=0);
	}

}
