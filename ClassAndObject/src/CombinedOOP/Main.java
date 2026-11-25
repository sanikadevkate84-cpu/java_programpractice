package CombinedOOP;

public class Main {
    public static void main(String[] args) {
        Book b1= new Book();
        b1.setTital(  "java programming");
        Ebook e = new Ebook();
        e.setTital(  "Python programming");
        Library l = new Library();
        l.ShowBook(b1);
        l.ShowBook(e);

    }
}
