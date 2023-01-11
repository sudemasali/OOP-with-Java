
package main;

public class Cylinder extends Shape3D{
    
    public Cylinder(double d,double r){
        super(d,0,0,r);
    }
    
    @Override
    public double getVolume(){
        return PI*radius*2*getDepth();
    }
    
    @Override
    public double getArea(){
        return 2*PI*radius*radius+2*this.PI*radius*getDepth();
    }
    
}
