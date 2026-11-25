public class DemoString1 {
    public static void main(String[] args) {
//        String name= "Sanika";
        StringBuilder s = new StringBuilder("Sanika");
        System.out.println(s.length());
//        System.out.println(s.reverse());
        System.out.println(s.capacity());


       System.out.println(s.delete(1,4));
//        s.append("sanika");
//        System.out.println(s);

    }
}
