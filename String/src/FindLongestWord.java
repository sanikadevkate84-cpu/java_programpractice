public class FindLongestWord {
    public static void main(String[] args) {
        String str = "Ram like mango and apple";
        String[] words = str.split(" ");
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
            }

        }
        for (int i=0;i<words.length;i++){
            if (words[i].length()==max){
                    System.out.println(words[i]);
            }
        }
    }
}