

package classwithmethodoverloaded;

import java.util.Scanner;

class Calculator{
    
int a,b;

  Calculator(int a,int b){
      this.a=a;
      this.b=b;
  }
  int add(){
      return a+b;
  }
  int sub(){
      return a-b;
  }
  int mul(){
      return a*b;
  }
  int div(){
      return a/b;
  }
}
public class CLASS_WITH_METHOD_OVERRIDING {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
     int c;   
     System.out.println("Enter value of a:");
     int a =scanner.nextInt();
     System.out.println("Enter value of b:");
     int b =scanner.nextInt();
     System.out.println("Enter operator(+,-,*,/):");
     int  op=scanner.nextInt();
     Calculator obj = new Calculator(a,b);
     switch(op){
         case '+':
             c=obj.add();
         break;
         
          case '-':
             c=obj.sub();
         break;
         
          case '*':
             c=obj.mul();
         break;
         
          case '/':
             c=obj.div();
         break;
     }
     
    }
    
}
