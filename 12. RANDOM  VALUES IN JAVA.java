import java.util.Random;
public class Random_values {

	public static void main(String[] args) {
		// Random Values
System.out.println("**************FINDING RANDOM VALUES IN BETWEEN**************\n");

	Random random = new Random();
	
	//int z = random.nextInt(10)+1;
	//double z = random.nextDouble();
	boolean z = random.nextBoolean();
	System.out.println("The Random Value is: " + z);
	}

}
