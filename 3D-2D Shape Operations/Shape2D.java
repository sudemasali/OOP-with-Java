
package main;


public abstract class Shape2D {
    public final double PI=3.14;
    double height;
    double radius;
    private double width;
    
    public Shape2D(double h,double w,double r){
        this.height=h;
        this.width=w;
        this.radius=r;
    }
   public double getWidth(){
       return width;
   }
   
   public abstract double getArea();
       
   
   
   @Override
   public String toString(){
       return "Area:"+getArea();
       
               
   }
    
}
