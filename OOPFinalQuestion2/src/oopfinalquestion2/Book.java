
package oopfinalquestion2;

public class Book implements Comparable<Book> {
    String name;
    double price;
    
    public Book(String n,double p){
        name=n;
        price=p;
    }
    
    public double totalPrice(){
       return price+(0.08*price);
    }
    
    @Override
    public int compareTo(Book b){
        return (int)(totalPrice()-b.totalPrice());
    }
    
    @Override
    public String toString(){
        return "Name:"+name+" Total price:"+totalPrice();
    }
    
    
    
    
    
}
