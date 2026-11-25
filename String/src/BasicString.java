public class BasicString {
    public static void main(String[] args) {


        String str = "aaabbccccd";
        StringBuilder sb = new StringBuilder(str);
        int count = 1;

        int i;
        for (i = 0; i < str.length(); i++) {
        if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
            count++;
        }else{
            sb.append(str.charAt(i));
            sb.append(count);
            count= 1;
        }
        }
        System.out.println(sb);
    }
    }