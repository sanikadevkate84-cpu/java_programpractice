public class StringBuilder1 {
    public static void main(String[] args) {
        String str = "Hello world";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) ==' '){
                sb.deleteCharAt(i);
                i--;
            }

        }
        System.out.println(sb);
    }
}




