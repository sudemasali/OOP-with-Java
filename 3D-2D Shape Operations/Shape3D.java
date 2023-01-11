
package main;

public abstract class Shape3D extends Shape2D{
    private double depth;
    public Shape3D(double d,double h,double w,double r){
        super(h,w,r);
        this.depth=d;
    }
    
    
    
    public double getDepth(){
        return depth;
    }
    public abstract double getVolume();
    
    @Override
    public String toString(){
        return "area: "+getArea()+"volume:"+getVolume();
    }
            
  }

