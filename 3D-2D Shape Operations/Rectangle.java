
package main;

public class Rectangle extends Shape2D {
    
    public Rectangle(double h,double w){
        super(h,w,0);
    }
    
    @Override
    public double getArea(){
        return height*getWidth();
    }
    
    
}
