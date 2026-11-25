package Constructor;

public class Student {
    String name;
    int age ;
    public void Student(String name , int age){
//        this.name= name ;
//        this.age = age ;
        System.out.println(name );
        System.out.println(age);

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Student("sanika",21);
    }
}
