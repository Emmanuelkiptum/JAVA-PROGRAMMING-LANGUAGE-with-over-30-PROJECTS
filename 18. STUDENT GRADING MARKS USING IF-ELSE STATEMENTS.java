import java.util.Scanner;
public class Grading_and_average {

	public static void main(String[] args) {
		// IF_PELSE STATEMENT TO CALCULTE AND EVALUATE MARKS GRADINGS 
		System.out.println("**************ENTERING STUDENT PERSONAL DETAILS**************\n");
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter the Name of the Student:");
	String name = scanner.nextLine();
	System.out.println("Enter the faculty of the Student:");
	String faculty = scanner.nextLine();
	System.out.println("Enter the Registration Number of the Student:");
	int reg_no = scanner.nextInt();
	System.out.println("Enter the Year of Study of the Student:");
	int year = scanner.nextInt();
	
	System.out.println("\n**************ENTERING STUDENT PERSONAL DETAILS**************\n");
	
	System.out.println("The Student Name is:" + name);
	System.out.println("The Student Faculty is:" + faculty);
	System.out.println("The Student Rgistration Number is:" + reg_no);
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
	
	
	}
}
