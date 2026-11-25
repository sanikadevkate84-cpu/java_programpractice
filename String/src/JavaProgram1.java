public class JavaProgram1 {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean result= true;
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch)==-1){
                result=false;
            }
        }
        if(result) {
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
        }

}