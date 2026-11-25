package CombinedOOP;

public class Book {
    private String Tital;
    public void setTital(String BookTital) {
        Tital = BookTital;
    }
        String getTital(){
        return Tital;
        }
        public void display(){
        System.out.println("Book"+Tital);

    }
}
