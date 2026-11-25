public class Employee {
    private static Object e2;
    int ID;
    String name;
    int salary;

    public void displayemployee() {
        System.out.println(ID + name + salary);
    }

    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.ID = 1;
        e1.name = "sanika";
        e1.salary = 40000;
        e1.displayemployee();

        Employee e2=new Employee();
        e2.ID = 2;
        e2.name ="Rahul";
        e2.salary= 30000;
        e2.displayemployee();

        Employee e3 = e2;
        e3.ID= 3;
        e3.name= "ruttu";
        e3.salary=50000;
        e3.displayemployee();

        Employee e4= e3;
        e4.ID= 4;
        e4.name= "Sakshi";
        e4.salary=60000;
        e4.displayemployee();

        Employee e5=e4;
        e5.ID= 5;
        e5.name= "Payal";
        e5.salary=70000;
        e5.displayemployee();



    }


    }




