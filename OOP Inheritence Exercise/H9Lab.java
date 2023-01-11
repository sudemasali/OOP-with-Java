
package h9lab;


public class H9Lab {

    public static void main(String[] args) {
     Book b=new Book();
     String[] authors={"Sait","Faik","Abasiyanik"};
     b.addAuthors(authors);
     for(String value: b.getAuthors())
            System.out.printf("%s ",value);
    
}
}
  