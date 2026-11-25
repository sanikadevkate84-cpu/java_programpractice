package Encapsulation;

public class Product {
    private int price;
    public void setPrice(int p){
        if(p>0);
        price=p;

    }
    public void display(){
        System.out.println("price :"+price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(300);
        p.display();

    }
}
