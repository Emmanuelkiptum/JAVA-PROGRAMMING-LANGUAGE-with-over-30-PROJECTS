
public class Arrays_Types {

	public static void main(String[] args) {
		// ARRAYS = is used to store multiple values in a single variable
		//1D ARRAY TYPES
       /* String[] cars= {"Toyota","BMW","V8","Chevrolet"};
        
        System.out.println(cars[1]); */
		
		/*String[] cars = new String[4];
		cars[0] = "Toyota";
		cars[1] = "BMW";
		cars[2] = "V8";
		cars[3] = "Chevrolet";
		
		
		System.out.println(cars[1]); */
		
		/*String[] cars = new String[4];
		cars[0] = "Toyota";
		cars[1] = "BMW";
		cars[2] = "V8";
		cars[3] = "Chevrolet";
		
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		} */
		
		//2D ARRAY TYPES
		//2D ARRAYS = is just an array of arrays
		
		/*String[][] cars = new String[3][3];
		
		cars[0][0] = "Toyota";
		cars[0][1] = "BMW";
		cars[0][2] = "V8";
		cars[1][0] = "Chevrolet";
		cars[1][1] = "Beamer";
		cars[1][2] = "Land";
		cars[2][0] = "Royce";
		cars[2][1] = "Corolla";
		cars[2][2] = "Mercedes";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j] + " ");
			}
		} */
		String[][] cars = {
				          {"Toyota","BMW","V8"},
				          {"Chevrolet","Beamer","Land"},
				          {"Royce","Corolla","Mercedes"}
		                  };
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
		
	}

}
