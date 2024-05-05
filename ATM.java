package Miniprojects;
 import java.util.Scanner;
    class ATM {
    int Balance;
    int PIN =6545;
 public void checkPin(){
        System.out.println("Enter your Pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin  = sc.nextInt();

        if(enteredpin==PIN){
            menu();
        }
       else{
        System.out.println("Enter a valid pin ");
       }
    
    }
    public void  menu(){
        System.out.println("Enter your choice");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.EXIT");
        Scanner sc  = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1){
            checkBalance();
        }
        if(option==2){
            withdrawMoney();
        }
        else if(option==3){
            depositeMoney();
        }
        else if(option==4){
          return;
        }
        else{
            System.out.println("Enter a valis choice");
        }
        
    }

    public void   checkBalance(){
        System.out.println("Balance:"+ Balance);

    }
    public void withdrawMoney(){
        System.out.println("Enter  amount to withdraw");
    }

    public void depositeMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc =  new Scanner(System.in);
    float amount = sc.nextInt();
   
    System.out.println("money Deposite Successfully");
    }

 public class AtMMachine{
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkPin();
        

    }
 }
    
}
