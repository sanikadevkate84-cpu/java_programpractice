package Encapsulation;

public class Student1 {
    private String name;
    private int marks;
    public void setName(String n) {
        name = n;
    }
    public void setMarks(int m) {
        if (m >= 0 && m <= 100) ;
        marks = m;
    }
    String setName(){

        return name;
    }
    int setMarks(){
        return marks;
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("Sanika");
        s.setMarks(84);
        System.out.println(s.setName());
        System.out.println(s.setMarks());

    }



}
