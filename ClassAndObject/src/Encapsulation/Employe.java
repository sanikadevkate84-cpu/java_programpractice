package Encapsulation;

public class Employe {
    private double salary;
     void setSalary(double salary) {
         if(salary>0);


    }
    public double getSalary(){
         return salary;

    }

    public static void main(String[] args) {
         Employe e= new Employe();
         e.setSalary(20000);
         System.out.println(e.getSalary());

    }
    }

