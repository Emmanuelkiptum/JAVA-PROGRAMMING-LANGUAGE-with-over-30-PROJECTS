

package converting_numbers_to_words;

 class CONVERTING_NUMBERS_TO_WORDS {

static final String[] units = 
{ ""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"}; 
static final String[] twoDigits = 
{" ten"," eleven"," twelve"," thirteen", " fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
 
 static final String[] tenMultiples = 
{"",""," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
 
 static final String[] placeValues =
{" ", " thousand"," million"," billion"," trillion"};
        
  static String convertNumber(long number) {    
    String word = "";    
    int index = 0;
    do {
      // take 3 digits in each iteration
      int num = (int)(number % 1000);
      if (num != 0){
        String str = ConversionForUptoThreeDigits(num);
        word = str + placeValues[index] + word;
      }
      index++;
      // next 3 digits
      number = number/1000;
    } while (number != 0);
    return word;
  }
    
  private static String ConversionForUptoThreeDigits(int number) {
    String word = "";    
    int num = number % 100;
    if(num < 10){
      word = word + units[num];
    }
    else if(num < 20){
      word = word + twoDigits[num%10];
    }else{
      word = tenMultiples[num/10] + units[num%10];
    }
    
    word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
    return word;
  }
    
  public static void main(String[] args) {     
System.out.println("\n-----------------------------------------------------------------------------"
        + "\n********************CONVERTING LARGER NUMBERS TO WORDS********************"
        + "\n-----------------------------------------------------------------------------\n");    
    System.out.println("908,767,856,766,577 IN WORDS IS:" + convertNumber(908767856766577L));
     
 
  }
}
