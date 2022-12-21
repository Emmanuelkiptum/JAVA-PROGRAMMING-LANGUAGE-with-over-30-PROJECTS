

package abstraction1;

import java.util.Scanner;

abstract class Bank{
    
Scanner scanner = new Scanner(System.in);

 abstract int simpleInterest();
 
 public Bank(){
 System.out.println("This is an Abstract class constructor:");
 }
}

class Simple extends Bank{
    
 public Simple(){
 System.out.println("This is a Simple class constructor:");
} 
 
int simpleInterest(){
 
 System.out.println("Enter the principle:");
 int principle = scanner.nextInt();
 System.out.println("Enter the rate:");
 int rate = scanner.nextInt();
 System.out.println("Enter the time:");
 int time = scanner.nextInt();
 
 int si = (principle*rate*time)/100;
 System.out.println("The simple interest is:"+ si);
 return si;
}
}

class Compound extends Simple{
    
 public Compound(){
 System.out.println("This is a compound class constructor:");
} 
 
int compoundInterest(){
 
 System.out.println("Enter the principle:");
 int principle = scanner.nextInt();
 System.out.println("Enter the rate:");
 int rate = scanner.nextInt();
 System.out.println("Enter the time:");
 int time = scanner.nextInt();
 
 int ci = principle*((1+rate)/100^time);
 System.out.println("\nThe compond interest is:"+ ci);
 return ci;
}
}
public class ABSTRACTION1 {

    public static void main(String[] args) {
     
        Simple bk = new Simple();
        bk.simpleInterest();
        Compound bn = new Compound();
        bn.compoundInterest();
        
    } 
}

