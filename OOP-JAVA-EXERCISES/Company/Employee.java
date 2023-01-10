
package Sude;
enum CompanyName{
    APPLE,
    MICROSOFT,
    GOOGLE,
    IBM,
    AKINSOFT;
}



public class Employee {
    
    private int id;
    private String name;
    
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
     String getName(){
         return name;
     }
     int getId()
     {
         return id;
     }
    static class Company {
    private Employee employee;
    private CompanyName companyName;
    
    Company(Employee e,CompanyName c)
    {
        this.employee=e;
        this.companyName=c;
    }
    Employee getEmployee()
    {
        return employee;
    }
    
    CompanyName getCompanyName(){
        return companyName;
    }
    
}
    
    
}
    

