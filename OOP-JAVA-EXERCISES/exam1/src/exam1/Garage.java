
package exam1;


public class Garage {
    private Car[] cars;
    public Garage(Car[] cars){
        this.cars=cars;
    }
      void printCarsOlderThan(int age){
        for(Car c:cars)
            if(c.getAge()>age)
                System.out.println(c);
    }
            
}
