
package main;


public class Circle extends Shape2D{
    
    public Circle(double r){
        super(0,0,r);
    }
    
    @Override
    public double getArea(){
      return  PI*radius*radius;
                
    }
    
    
    
}
