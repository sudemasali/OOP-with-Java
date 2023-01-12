
package exampleınterface1;

public class main {

    
    public static void main(String[] args) {
        Student s1=new MasterStudent (1234,70,85,2);
        Student s2=new BachelourStudent(2345,82,55);
        Student s3=new PhDStudent(3456,65,70,5,4);
        
        Student[] students=new Student[]{s1,s2,s3};
        
        for(Student s:students)
            System.out.println("ID:"+s.getID()+s.toString());
        
        
        
    }
    
}
