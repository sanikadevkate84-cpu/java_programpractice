package CombinedOOP;

public class OnlineShoppingSystem {
    public static void main(String[] args) {

        Electronies e= new Electronies();
        e.setPrice(10000);
        e.discount();
        System.out.println("Electronies :"+e.getPrice());
        Clothing c = new Clothing();
        c.setPrice(2000);
        c.discount();
        System.out.println("Clothing :"+c.getPrice());
        Food f = new Food();
        f.setPrice(500);
        f.discount();
        System.out.println("Food :"+f.getPrice());

    }
}
