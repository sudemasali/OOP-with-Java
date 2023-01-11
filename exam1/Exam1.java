
package exam1;


public class Exam1 {

    
    public static void main(String[] args) {
        Car c1=new Car(1,2010);
        Car c2=new Car(2,2000);
        Car c3=new Car(3,2022);
        Car c4=new Car(4,1998);
        c1.setPower(140);
        c2.setPower(200);
        c3.setPower(300);
        c4.setPower(50);
        Car[] dizi={c1,c2,c3,c4};
        Garage g1=new Garage(dizi);
        g1.printCarsOlderThan(7);
        
        
            
            
        
        
        
        
    }
    
}
