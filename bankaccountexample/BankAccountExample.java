
package bankaccountexample;
import java.util.*;
public class BankAccountExample {

    
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1234,"Sude Nur Maşalı",350);
        BankAccount b2=new BankAccount(2345,"Serap Maşalı",6700);
        BankAccount b3=new BankAccount(3456,"Uğur Maşalı",50000);
        BankAccount b4=new BankAccount(4567,"Onur Maşalı",15500);
        BankAccount b5=new BankAccount(5678,"GirayHan Maşalı",110);
        
        ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        accounts.add(b4);
        accounts.add(b5);
        
        Collections.sort(accounts,new NameComparator());
        Iterator itr=accounts.iterator();
        for(BankAccount ba: accounts){
           ba.balanceChange(500);
            System.out.println(ba);
      }
        
        
        
    }
    
}
