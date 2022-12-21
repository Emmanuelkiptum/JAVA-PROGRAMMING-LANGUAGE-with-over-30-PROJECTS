
package expression1;

public class EXPRESSION1 {

    public static void main(String[] args) {
     
        int x = 10;
        int y = 20;
        int temp;
        
        temp=x;
        x =y;
        y = temp;
        
        System.out.println("The value of X is:"+x);
        System.out.println("\nThe value of Y is:"+y);   
    }  
}
