import java.util.*;
public class task3 {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
         System.out.println("Welcome to ATM!");
         //Pin is=123456;
         int pin=123456;
         System.out.print("Enter 6-Digit Pin: ");
         int enterpin=sc.nextInt();

         if(pin==enterpin){
            System.out.println("login successful!");
            System.out.println("choose 1 to withdraw");
            System.out.println("choose 2 to Deposit");
           
        while(true){
           
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter amount to Withdraw");
                withdraw(choice);
                break;
                case 2:
                System.out.println("enter the amount to Deposit");
                Deposit(choice);
                break;
               
            }
            System.out.println("Transcation Complete!");
            System.out.println("Thankyou for using ATM!");
         }
         
            
        }else{
            System.out.println("Invalid Pin");
        }
         
    }
    public static void withdraw( int amount){
        Scanner sc=new Scanner (System.in);
        int balance=10000;
        int withdraw=sc.nextInt();
        if(balance>=withdraw){
            System.out.println("Collect your cash!");
            System.out.print("Do you want to see available balance? Press '0' to yes and '1' to no:");
            int choice=sc.nextInt();
            switch(choice){
                case 0:int availableBalance=balance-withdraw;
                System.out.println("Available Balance : "+availableBalance);
                s
                   break;
                case 1: System.out.println("");
         }
         }else{
        System.out.println("Insufficient Amount Available!");
     }
    }
    public static void Deposit(int amount){
        Scanner sc=new Scanner (System.in);
        int balance=10000;
        int deposit=sc.nextInt();
        int totalAmount=balance+deposit;
        System.out.println("Total Amount Available is :"+totalAmount);
       

    }
   

}
