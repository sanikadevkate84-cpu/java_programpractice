import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tryCatch {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader f = new FileReader("abc.txt");
            System.out.println("File opened");
            f.close();
        } catch (IOException e) {
            System.out.println("File error");
        }finally {
            System.out.println("Finally block executed");

        }
    }

}
