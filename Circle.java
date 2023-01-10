
package countcircle;

public class Circle {
    private final static double PI=3.141519; 
    private double radius; 
    
    
    
    public Circle(double r){
        this.radius=r;  
        
    }
    public double countArea(){
        return PI*radius*radius;
    }
    
}


 