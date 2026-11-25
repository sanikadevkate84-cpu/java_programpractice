public class CountVowels {
    public static void main(String[] args) {
        String s = "sanika";
        int count = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
        char ch = Character.toLowerCase(s.charAt(i));
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;

        }

    }
    System.out.println("Number of vowela :"+count);
   }

}
