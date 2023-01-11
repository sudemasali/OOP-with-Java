
package main;

public class Pyramid extends Shape3D{
    
    public Pyramid(int d,int h,int w){
        super(d,h,w,0);
    }
    
    @Override
    public double getVolume(){
        return height*getWidth()*getDepth()/3;
    }
    
    @Override
    public double getArea(){
        return getWidth()*height+height*getDepth()+getWidth()*getDepth();
    }
    
    
}
