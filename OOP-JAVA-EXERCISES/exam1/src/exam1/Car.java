
package exam1;


public class Car {
   private int id;
   private int productionYear;
   private int power;
   public static int counter;
    
    public Car(int id,int productionYear){
        this.id=id;
        this.productionYear=productionYear;
        counter++;
    }
    public void setPower(int power)
    {
        this.power=power;
    }
    public int getproductionYear(){
        return productionYear;
    }
    public int getAge(){
        int Age=2022-productionYear;
        return Age;
    }
    void startAndMove(){
        System.out.println("start");
    }
    void stop(){
        System.out.println("Stop");
    }
    @Override
    public String toString(){
        return "id:"+id+"production year:"+productionYear+"Power:"+power;
    }
 
    
    
}