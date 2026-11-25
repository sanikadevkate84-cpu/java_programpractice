public class Book {
    String tital;
    String author;
    int price;

    public void display(String tital) {
        System.out.println(tital);
    }

    public void display1(String author) {
        System.out.println(author);
    }

    public void display3(int price) {
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.display("jane eyre");
        b.display1("charlotte bronte ");
        b.display3(200);

    }

    }



