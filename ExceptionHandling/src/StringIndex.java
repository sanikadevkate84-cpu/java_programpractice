public class StringIndex {
    public static void main(String[] args) {
        try {
            String str="Sanika";
            System.out.println(str.charAt(7));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
