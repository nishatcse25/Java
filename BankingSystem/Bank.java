package bankapp;
import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<BankAccount> accounts;
    public Bank(String name){
        bankName = name;
        accounts = new ArrayList<BankAccount>();
    }
    
    private void addAccount(BankAccount acc){
        accounts.add(acc);
    }
    public void addAccount(String name,double balance){
        BankAccount ba = new BankAccount(name, balance);
        addAccount(ba);
    }
    public BankAccount findAccount(String accNum){
        for(int i = 0; i<accounts.size();i++)
        {
            BankAccount ba = accounts.get(i);
            if(accNum.equals(ba.getAccNum()))
            {
                return accounts.get(i);
            }
        }
        return null;
    }
    public void deposite(String accNum, double depAmount){
        BankAccount ba;
        ba = findAccount(accNum);
        if (ba != null) {
            ba.deposit(depAmount);
        }
        else{
            System.out.println("Account NUMBER NOT VALID.");
        }
    }
    public void withdraw(String accNum,double depAmount){
        BankAccount ba;
        ba = findAccount(accNum);
        if (ba != null) {
            ba.withdraw(depAmount);
        }
        else{
            System.out.println("Account NUMBER NOT VALID.");
        }
    }
    
      public void display(String accNum){
        BankAccount ba;
        ba = findAccount(accNum);
        if (ba != null) {
            ba.display();
        }
        else{
            System.out.println("Account NUMBER NOT VALID.");
        }
    }
    
    
    
    public void display(){
        for(int i = 0; i<accounts.size();i++){
            BankAccount ba = accounts.get(i);
            ba.display();
        }
    }
}
