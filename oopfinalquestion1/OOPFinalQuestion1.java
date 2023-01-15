
package oopfinalquestion1;

public class OOPFinalQuestion1 {

    public static void main(String[] args) {
       Duck d1=new Duck();
       Fish f1=new Fish();
       Animal a=new Duck();
       //a.swim(); Animal does not contain swim().So you have to downcast Animal to Duck.
       ((Duck)a).swim();
       ((Duck)a).fly();
       //Flyable f=(Flyable) new Fish();
       // f.fly();  compile but not run
       Animal f=new Fish();
       f=new Duck();
       
       
       
       
       
    }
    
}
