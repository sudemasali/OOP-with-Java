
package main;


public class Main {

    public static void main(String[] args) {
        Shape2D s1=new Circle(5);
        Shape3D s2=new Cone(5,2);
        Shape3D s3=new Cylinder(7,1);
        Shape3D s4=new Pyramid(5,6,2);
        Shape2D s5=new Rectangle(6,5);
        Shape3D s6=new Sphere(2,12);
        Shape2D s7=new Square(10);
        
        Shape2D[] shapes1=new Shape2D[]{s1,s5,s7};
        
        for(Shape2D a: shapes1){
            System.out.println(a);
        }
        
        Shape3D[] shapes2=new Shape3D[]{s2,s3,s4,s6};
        
        for(Shape3D b: shapes2){
            System.out.println(b);
        }
            
            
            
            
        
        
    }
    
}
