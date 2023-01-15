
package oopfinalquestion1;


public class Duck extends Animal implements Swimmable,Flyable {
    
    @Override
    public void swim(){
        System.out.println("Duck is swimming.");
    }
    
    @Override
    public void fly(){
        System.out.println("Duck is flying.");
    }
    
    @Override 
    public void move(){
        System.out.println("Duck is moving.");
    }
    
    
    
}
