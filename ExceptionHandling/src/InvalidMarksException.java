public class InvalidMarksException {
    static void check(int marks)throws Exception{
        if (marks>100||marks<0){
            throw new Exception("Invalid Marks");
        }
        System.out.println("Valid marks");
    }

    public static void main(String[] args) {
        try {
            check(120);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}