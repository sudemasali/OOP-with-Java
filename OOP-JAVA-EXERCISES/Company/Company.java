
package Sude;

public class Sude {

   
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Rumeysa");
        Employee e2=new Employee(2,"Berna");
        Employee e3=new Employee(3,"Sude");
        Employee e4=new Employee(4,"Melike");
        Employee e5=new Employee(5,"Batuhan");
        
        Employee.Company c1=new Employee.Company(e1, CompanyName.IBM);
        Employee.Company c2=new Employee.Company(e2, CompanyName.AKINSOFT);
        Employee.Company c3=new Employee.Company(e3, CompanyName.APPLE);
        Employee.Company c4=new Employee.Company(e4, CompanyName.GOOGLE);
        Employee.Company c5=new Employee.Company(e5, CompanyName.APPLE);
        
        Employee.Company[] dizi1={c1,c2,c3,c4,c5};
        Employee[] dizi={e1,e2,e3,e4,e5};
        
        for(int i=0;i<5;i++){
            System.out.println(dizi[i].getId()+dizi[i].getName()+" "+dizi1[i].getCompanyName());
        }
        
        
        
        
    }
    
}
