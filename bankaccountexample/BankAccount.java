
package bankaccountexample;

public class BankAccount {
    private  int accountNo;
    private String holderName;
    private double balance;
    
    public BankAccount(int an,String hn,double b){
        accountNo=an;
        holderName=hn;
        balance=b;
    }
    @Override
    public String toString(){
        return "Account No:"+accountNo+" Holder Name:"+holderName+" Balance:"+balance;
    }
   
    public double balanceChange(double amount){
       balance=balance-amount; 
       return balance;
    }
    
    public int getAccountNo(){
        return accountNo;
    }
    
    public String getHolderName(){
        return holderName;
    }
    
    public double getBalance(){
        return balance;
    }
    
    
    
}
