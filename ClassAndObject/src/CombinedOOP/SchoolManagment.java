package CombinedOOP;

public class SchoolManagment {
  public  static void main(String[] args) {
        Student s = new Student();
        s.setName("Sanika");
        Teacher t = new Teacher();
        t.setName("Rahul");
        Staff st = new Staff();
        st.setName("Kartik");
        s.display();
        t.display();
        st.display();

    }
}
