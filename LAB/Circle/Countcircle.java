
package countcircle;

import java.util.Scanner;


public class Countcircle {

    
    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        Circle circle2=new Circle(10);
        Circle circle3=new Circle(15);
        Circle[] dizi=new Circle[3];
        dizi[0]=circle1;
        dizi[1]=circle2;
        dizi[2]=circle3;
        
        for(Circle dizi1: dizi){
            System.out.println(dizi1.countArea());
        }
        
        
    }
        
        
        
        
        
  

        
        
        
        
        
    }
    

