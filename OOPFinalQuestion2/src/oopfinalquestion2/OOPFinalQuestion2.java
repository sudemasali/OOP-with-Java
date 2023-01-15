
package oopfinalquestion2;
import java.util.*;
public class OOPFinalQuestion2 {

    public static void main(String[] args) {
       Book b1=new Book("Uçurtma Avcısı",26.50);
       Book b2=new Book("1984",35);
       Book b3=new Book("Kürk Mantolu Madonna",19.90);
       Book b4=new Book("Mary Stuart",45.75);
       
       LinkedList<Book> books=new LinkedList<Book>();
       
       books.add(b1);
       books.add(b2);
       books.add(b3);
       books.add(b4);
       
       Collections.sort(books);
       
       Iterator itr=books.iterator();
       
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       
       
    }
    
}
