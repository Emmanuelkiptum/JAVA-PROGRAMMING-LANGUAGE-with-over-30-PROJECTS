

import java.util.Scanner;
class Bank{
int amount,balance,acc_no;
String name,type;
int pin = 1234;

Scanner scanner = new Scanner(System.in);

void get(){
    System.out.println("Enter the type of the Bank:");
    type = scanner.next();
    System.out.println("Enter the account number of the depositor:");
    acc_no= scanner.nextInt();
    System.out.println("Enter the name of the depositor:");
    name = scanner.next();    
}

void new_balance(){
    System.out.println("CHECK NEW BALACE:");
    System.out.println("Enter the pin number:");
    pin = scanner.nextInt();
    if(pin==1234){
    System.out.println("Enter the new balance:");    
    balance = scanner.nextInt();
    } 
    else{
        System.out.println("You have entered a wrong pin.please try again:");
    }
}

void deposit(){
    
 System.out.println("Enter the amount to deposit:");
 amount = scanner.nextInt();
 balance = balance + amount;
 System.out.println("Balance after deposit is:" + balance);   
}

void withdraw(){
  int choice;
  
 System.out.println("\nWITHRAW THROUGH :");
 System.out.println("\n1.AGENT NO.:");
 System.out.println("\n2.PAYBILL :");
 System.out.println("\n3.EXIT :");
 System.out.println("Enter your Choice:");
 choice = scanner.nextInt();
 switch(choice){
     case 1:
       System.out.println("*****AGENT NO*****:");  
     break;
     case 2:
       System.out.println("*****PAYBILL*****:");  
     break;
     case 3:
       System.out.println("*****EXIT*****:");  
     break;
     default:
       System.out.println("You have entered wrong option:"); 
     break;
 }
 
 System.out.println("Enter the amount to withdraw:");
 amount = scanner.nextInt();
 if(balance>amount){
    balance = balance - amount;
 System.out.println("Balance after withdraw is:" + balance);  
    } 
    else{
        System.out.println("You have insufficient balance.Please try later:");
    }
}

void send_money(){
  int choice;
  
 System.out.println("\nSEND TO :");
 System.out.println("\n1.MY NUMBER:");
 System.out.println("\n2.OTHER NUMBER :");
 System.out.println("\n3.OTHER ACCOUNT NUMBER :");
 System.out.println("\n4.EXIT:");
 System.out.println("Enter your Choice:");
 choice = scanner.nextInt();
 switch(choice){
     case 1:
       System.out.println("*****MY NUMBER*****:");  
     break;
     case 2:
       System.out.println("*****OTHER NUMBER*****:");  
     break;
     case 3:
       System.out.println("*****OTHER ACCOUNT NUMBER*****:");  
     break;
     case 4:
       System.out.println("*****EXIT*****:");  
     break;
     default:
       System.out.println("You have entered wrong option:"); 
     break;
 }

 System.out.println("Enter the amount to Send:");
 amount = scanner.nextInt();
 if(balance>amount){
    balance = balance - amount;
 System.out.println("Balance after sending money is:" + balance);  
    } 
    else{
        System.out.println("You have insufficient balance.Please try later:");
    }
}

void Buy_Airtime(){
  int choice;
 
 System.out.println("\nBUY TO :");
 System.out.println("\n1.MY NUMBER:");
 System.out.println("\n2.OTHER NUMBER :");
 System.out.println("\n3.EXIT:");
 System.out.println("Enter your Choice:");
 choice = scanner.nextInt();
 switch(choice){
     case 1:
       System.out.println("*****MY NUMBER*****:");  
     break;
     case 2:
       System.out.println("*****OTHER NUMBER*****:");  
     break;
     case 3:
       System.out.println("*****EXIT*****:");  
     break;
     default:
       System.out.println("You have entered wrong option:"); 
     break;
 }

 System.out.println("Enter the amount to Buy airtime:");
 amount = scanner.nextInt();
 if(balance>amount){
    balance = balance - amount;
 System.out.println("Balance after buying airtime is:" + balance);  
    } 
    else{
        System.out.println("You have insufficient balance.Please try later:");
    }
}
void Check_balance(){
    System.out.println("*******CHECK BALANCE*******:");
    System.out.println("New balance after Transactions is:" + balance);
}
}

public class ATM_TRANSACTION {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        Bank bk = new Bank();
        int option;
        do{
        System.out.println("\n*****BANK TRANSATION SYSTEM****** :");
 System.out.println("\n1.GET DETAILS:");
 System.out.println("\n2.NEW BALANCE :");
 System.out.println("\n3.DEPOSIT AMOUNT:");
 System.out.println("\n4.WITHDRAW AMOUNT :");
 System.out.println("\n5.SEND MONEY:");
 System.out.println("\n6.BUY AIRTIME :");
 System.out.println("\n7.CHECK BALANCE:");
 System.out.println("\n8.EXIT:");
 System.out.println("Enter your Choice:");
 option = scanner.nextInt();
 switch(option){
     case 1:
       System.out.println("*****GET DETAILS*****:"); 
       bk.get();
     break;
     case 2:
       System.out.println("*****NEW BALANCE*****:");
       bk.new_balance();
     break;
     case 3:
       System.out.println("*****DEPOSIT AMOUNT*****:"); 
       bk.deposit();
     break;
     case 4:
       System.out.println("*****WITHDRAW AMOUNT*****:"); 
        bk.withdraw();
     break;
     case 5:
       System.out.println("*****SENDING MONEY*****:");
       bk.send_money();
     break;
     case 6:
       System.out.println("*****BUY AIRTIME*****:"); 
       bk.Buy_Airtime();
     break;
     case 7:
       System.out.println("****CHECKING BALANCE*****:");
       bk.Check_balance();
     break;
     case 8:
       System.out.println("*****EXIT*****:"); 
     break;
     default:
        System.out.println("You have entered Invalid option:");  
      } 
        }while(option !=0);
    }   
  }
