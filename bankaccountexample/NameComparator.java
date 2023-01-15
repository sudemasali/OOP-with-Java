
package bankaccountexample;
import java.util.Comparator;
public class NameComparator implements Comparator<BankAccount>{
    
    @Override
    public int compare(BankAccount b1,BankAccount b2){
      return  b1.getHolderName().compareTo(b2.getHolderName());
    }
    
}
