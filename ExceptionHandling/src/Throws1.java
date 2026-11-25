public class Throws1 {
    static void check()throws Exception{
        int age = 20;
        if(age<18){
           throw new Exception("Not Eligible for vote");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
