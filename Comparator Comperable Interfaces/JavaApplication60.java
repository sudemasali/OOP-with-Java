
package javaapplication60;
import java.util.*;
public class JavaApplication60 {

    
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<Student>();
        students.add(new Student(21,201025047,"Sude Nur Maşalı"));
        students.add(new Student(28,566,"Onur Maşalı"));
        students.add(new Student(50,1073,"Serap Maşalı"));
        students.add(new Student(52,280,"Uğur Maşalı"));
        students.add(new Student(11,36,"GirayHan Maşalı"));
        
        System.out.println("***Unsorted List***");
        Iterator itr=students.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("\n\n***Sorted by age(Ascending Order)***");
        Collections.sort(students);
        for(Student st: students){
            System.out.println(st);
        }
        
        System.out.println("\n\n***Sorted by name(Alphabetic order)***");
        Collections.sort(students,new NameComparator());
        Iterator itr2=students.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
        System.out.println("\n\n***Sorted by number***(Ascending Order");
        Collections.sort(students,new NumberComparator());
        Iterator itr3=students.iterator();
        for(Student st: students ){
            System.out.println(itr3.next());
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
