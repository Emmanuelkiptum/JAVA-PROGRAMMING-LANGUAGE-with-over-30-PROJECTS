

package classstudent;

import java.util.Scanner;

class Student{

	String name,s_name;
	int roll;
	int[] marks = new int[5];
	double sum=0,average=0;
        void set(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the name of the student:");
	s_name = scanner.next();
	System.out.println("Enter the Roll number of the student:");
	roll = scanner.nextInt();
	
	for(int i=0;i<5;i++) {
	System.out.println("Enter the name of the subject:");
	name = scanner.next();
	System.out.println("Enter the marks of the subject:");
	marks[i] = scanner.nextInt();
        }
	}
	void compute(){
    sum =sum + marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
	System.out.println("The total sum is:"+sum);
	
	average = sum/5;
	System.out.println("The Average is:"+average);
	
	if(average>=70)
	{
		System.out.println("The grade is A:");	
	}
	
	else if(average>=60 && average<=69)
	{
		System.out.println("The grade is B:");	
	}
	
	else if(average>=50 && average<=59)
	{
		System.out.println("The grade is C:");	
	}
	
	else if(average>=40 && average<=49)
	{
		System.out.println("The grade is D:");	
	}
	
	else
	{
		System.out.println("The grade is F:");	
	}
        }
        void display(){
	System.out.println("******\n\n\nSTUDENT EXAMINATION REPORT******:");
	System.out.println("The name of the student is:"+s_name);
	System.out.println("The Roll Number of the student is:"+roll);
	System.out.println("The marks of the student is: \nMATHS  "+marks[0]+"\nKISWAHILI  "+marks[1]+"\nENGLISH  "+marks[2]+"\nBIOLOGY  "+marks[3]+"\nCHEMISTRY  "+marks[4]);
	System.out.println("The Sum of the Student is:"+sum);
	System.out.println("The average of the student is:"+average);
	System.out.println("THE KARENGER BOYS HIGH:");
	}
        void all(){
 set();
 compute();
 display();
}
}

public class CLASS_STUDENTS {

    public static void main(String[] args) {
        Student std = new Student();
        std.all();   
    }  
}