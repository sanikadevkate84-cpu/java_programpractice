package CombinedOOP;

public class Person {
    private String name ;
    public void setName(String Personname){
        name = Personname;
    }
    String getName(){
        return name;
    }
    public void display(){
        System.out.println("name"+getName());
    }
}
