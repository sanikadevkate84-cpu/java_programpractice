public class Palindrome {
    public static void main(String[] args) {


        String str = "madam";
        StringBuilder sb = new StringBuilder(str);

        if (str.equals(sb.reverse().toString())) {
            System.out.println("Palindrome");
        } else{
             System.out.println("Not Palindrome");
            }

        }

    }
