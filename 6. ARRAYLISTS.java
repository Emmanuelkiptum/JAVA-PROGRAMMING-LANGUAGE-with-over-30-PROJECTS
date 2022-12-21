import java.util.ArrayList;
public class ARRAY_LIST {

	public static void main(String[] args) {
		// ARRYALIST =is just a resizeable array...it is used to store reference data type
        //2D Arraylist
		ArrayList<ArrayList<String>> groceryList = new ArrayList();	
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Mandazi");
		bakeryList.add("donuts");
		bakeryList.add("Chapati");
		bakeryList.add("pizza");
		
		ArrayList<String> FarmingList = new ArrayList();
		FarmingList.add("Maize");
		FarmingList.add("eggs");
		FarmingList.add("beans");
		FarmingList.add("wheat");
		
		ArrayList<String> MachineryList = new ArrayList();
		MachineryList.add("Steal");
		MachineryList.add("metals");
		MachineryList.add("irons");
		MachineryList.add("copper");
		
		ArrayList<String> BusinessList = new ArrayList();
		BusinessList.add("sells");
		BusinessList.add("buyings");
		BusinessList.add("credits");
		BusinessList.add("goods");
		
		
		groceryList.add(bakeryList);
		groceryList.add(FarmingList);
		groceryList.add(MachineryList);
		groceryList.add(BusinessList);
		System.out.println(groceryList.get(0).get(0));
	}

}
