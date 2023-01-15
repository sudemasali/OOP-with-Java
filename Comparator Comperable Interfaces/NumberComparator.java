
package javaapplication60;
import java.util.Comparator;
public class NumberComparator implements Comparator<Student> {
    
    @Override
   public int compare(Student s1,Student s2){
       return s1.getNumber()-s2.getNumber();
   }
       
    
}