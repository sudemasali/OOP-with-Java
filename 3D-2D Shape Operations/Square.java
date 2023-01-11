
package main;

public class Square extends Shape2D {
  
    public  Square(double w){
        super(0,w,0);
    }
    
    @Override
    public double getArea(){
        return getWidth()*getWidth();
    }
    
    
}
