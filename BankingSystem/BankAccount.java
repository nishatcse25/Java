/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankapp;

import java.util.Random;

/**
 *
 * @author Projectpc-16
 */
public class BankAccount {
    private String memberName,accNumber;
    private double accountBalance;
    
    public BankAccount(String name,double balance){
        memberName=name;
        accountBalance=balance;
      
        Random rand=new Random();
        String num=""+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
          accNumber=num;
        
    }
    public void deposit(double d)
    {
        accountBalance+=d;
    }
  public void withdraw(double withAmount)
     {
         accountBalance = accountBalance - withAmount;
     }
     public String getAccNum()
     {
         return accNumber;
     }
     public double getBalance()
             {
                 return accountBalance;
             }
     public void display()
     {
         System.out.println("Name: "+memberName+" Account Number: "+accNumber+" Balance: " + accountBalance);
     }
        
    
}

