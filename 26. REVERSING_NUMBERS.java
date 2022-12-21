
package reversing_number;

public class REVERSING_NUMBERS {

  public static void main(String args[])
  {
      System.out.println("\n--------------------------------------------------------------------------------"
              + "\n**********************PROGRAM FOR REVERSING A GIVEN NUMBER**********************"
              + "\n--------------------------------------------------------------------------------\n");
      
    int number=98765,reversing_Number=0;

System.out.println("THE INITIAL NUMBER IS:\t"+number);
    while(number!=0)
    {
      reversing_Number = reversing_Number * 10;
      reversing_Number = reversing_Number + number%10;
      number = number/10;
    }

    System.out.println("\nTHE REVERSE OF THE NUMBER IS:\t" + reversing_Number);
  }
}
