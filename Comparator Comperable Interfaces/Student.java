
package javaapplication60;


public class Student implements Comparable<Student> {
    private int age;
    private int number;
    private String name;
    public Student(int a,int num,String n)
    {
        age=a;
        number=num;
        name=n;
    }
    @Override
    public int compareTo(Student st){
        return getAge()-st.getAge();
    }
    @Override
    public String toString(){
        return "Age:"+getAge()+" Number:"+getNumber()+" Name:"+getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
