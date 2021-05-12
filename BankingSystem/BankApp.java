
package bankapp;

import java.util.Scanner;


public class BankApp {

  
    public static void main(String[] args) {
    
    Bank bank =new Bank (null);
    Scanner sc =new Scanner(System.in);
    System.out.println("Input 1:Create New Account.");
    System.out.println("Input 2:Deposit Money.");
    System.out.println("Input 3:Withdraw Money.");
    System.out.println("Input 4:Display the Account info of a particular account.");
    System.out.println("Input 5:Display all accounts.");
    System.out.println("Input 6:Exit.");
    while (true) {
     int op;  
     op = sc.nextInt();
     if (op==1){
         String memberName;
         double balance;
         memberName =sc.next();
         balance =sc.nextDouble();
         bank.addAccount(memberName, balance);
     }
     else if(op==2){
         String accNum;
         double money;
         accNum=sc.next();
         money =sc.nextDouble();
         bank.deposite(accNum,money);
     }
     else if(op==3){
         String accNum;
         double money;
         accNum=sc.next();
         money =sc.nextDouble();
         bank.withdraw(accNum,money);
    }
      else if(op==4){
         String accNum;
         accNum=sc.next();
         bank.display(accNum);
     }
     
  else if(op==5){
      bank.display();
  }
  else if(op==0){
      break;
  }
    }
    }
}
