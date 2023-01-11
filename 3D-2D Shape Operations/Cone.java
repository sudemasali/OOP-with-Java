
package main;

public class Cone extends Shape3D{
    
    public Cone(double h,double r){
        super(0,h,0,r);
    }
    
    @Override
    public double getVolume(){
        return height*PI*radius*radius/3;
    }
    
    @Override
    public double getArea(){
        return PI*radius*radius+2*PI*radius*height;
    }
    
    
}
