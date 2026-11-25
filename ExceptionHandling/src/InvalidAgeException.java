public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
        }
    }

public void main(String[] args) {
    int age = 16;
    try {
        if(age<18) throw new InvalidAgeException("Not Eligible");
        System.out.println("Eligible for registration");


} catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
