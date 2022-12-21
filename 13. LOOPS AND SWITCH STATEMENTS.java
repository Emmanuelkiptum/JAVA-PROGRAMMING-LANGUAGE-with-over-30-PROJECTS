import java.util.Scanner;
public class LOOPINGS {

	public static void main(String[] args) {
		// Program to test all type of Loops
		Scanner scanner = new Scanner(System.in);
		
        int type;
        
	do {
		// Switch Statement
System.out.println("\n**************SWITCH AND TYPES OFLOOPS STATEMENTS**************\n");
		System.out.println("\n"
				+ " 1. FOR LOOPS:\n"
				+ " 2. WHILE LOOPS:\n"
				+ " 3. DO WHILE LOOPS:\n"
				+ " 4. NESTED LOOPS:\n"
				+ " 5. EXIT");
		
		System.out.println("\nEnter the Type of Loop you need to use:");
	   type = scanner.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("\n***************FOR LOOPS*************");
			//FOR LOOP = executes a block of code with a limited amount of time
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
			System.out.println("Woow our FOR LOOP is Working Successfully");
		break;
		
		case 2:
			System.out.println("\n***************WHILE LOOPS*************");
			//WHILE LOOPS = Executes a block of code as long as it's condition remains true
			int r=0;
			while(r<=10) {
				System.out.println(r);
				r++;
			}
			System.out.println("Woow our WHILE LOOP is Working Successfully");
		break;
		
		case 3:
			System.out.println("\n***************DO WHILE LOOPS*************");
			int x=0;
			do {
				System.out.println(x);
			   x++;
			}
			while(x<=10);
			System.out.println("Woow our DO WHILE LOOP is Working Successfully");
		break;
		
		case 4:
			System.out.println("\n***************NESTED LOOPS*************");
			//NESTED LOOPS = is a loop inside another loop
			int rows;
			int columns;
			String symbol = "";
			
			System.out.println("\nEnter the number of rows:");
			   rows = scanner.nextInt();
			System.out.println("\nEnter the number of columns:");
			   columns = scanner.nextInt();
			System.out.println("\nEnter the type of symbol:");
			   symbol = scanner.next();
			   
		   for(int i=1; i<=rows; i++) {
					System.out.println();
					for(int j=1; j<=columns; j++) {
						System.out.print(symbol);
					}
				} 
		   System.out.print("\n");
		break;
		case 5:
		System.out.println("You have terminate the process");
		break;
		
		default:
			System.out.println("The type you enter does not exist");
		break;
		}
		type++;
	}while(type !=0);
	}

}
