
package circle_operation;
import java.util.Scanner;
public class CIRCLE_OPERATIONS {

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     float radius,diameter;
     float area,circumference;
     final double PI=3.142;
     System.out.println("Enter the radius value:");
     radius=scanner.nextFloat();
     area=(float)PI*radius*radius;
     circumference=(float)PI*2*radius;
     diameter=(float)radius*2;
     System.out.println("The DIAMETER of a CIRCLE is:\n"+diameter+" cm");
     System.out.println("The AREA of a CIRCLE is:\n"+area+" square cm");
     System.out.println("The CIRCUMFERENCE of a Rectangle is:\n"+circumference+" cm");

    }
    
}
