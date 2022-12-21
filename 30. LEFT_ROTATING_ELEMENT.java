
package left_rorating_element;

public class LEFT_ROTATING_ELEMENT {

    public static void main(String[] args) {
           
 System.out.println("\n-----------------------------------------------------------------------------------"
         + "\n***************PROGRAM FOR LEFT ROTATING ELEMENTS IN LEFT TO RIGHT*****************"
         + "\n-----------------------------------------------------------------------------------\n");  
   
int [] array =new int[]{0,1,2,3,4,5,6,7,8};  
int Starting_Number = 5,j;  
System.out.println("ORIGINAL ARRAY LIST IS:");  
for (int i = 0; i < array.length; i++) {  
System.out.print(array[i] + "  ");  
}  
for(int i = 0; i<Starting_Number ; i++){
    
int First_Element = array[0];  
for(j = 0; j < array.length-1; j++){  
array[j] = array[j+1];  
} 
array[j] = First_Element;  
}   
System.out.println("\nARRAY AFTER THE ROTATING FROM LEFT IS: ");  
for(int i = 0; i< array.length; i++){  
System.out.print(array[i]+"  ");  
}  
}  
}  
