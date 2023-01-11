
package main;

public class Sphere extends Shape3D {
    
    public Sphere(int d,double r){
        super(d,0,0,r);
    }
    
    @Override
    public double getVolume(){
        return (4/3)*PI*radius*radius*radius;
    }
    
    @Override
    public double getArea(){
        return 4*PI*radius*radius;
    }
    
}
