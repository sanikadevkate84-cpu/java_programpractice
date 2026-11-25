public class Stringbuilder {
    public static void main(String[] args) {
        String str = "Sanika";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Original :"+str);
        System.out.println("reversed :"+sb.reverse());
    }
}
