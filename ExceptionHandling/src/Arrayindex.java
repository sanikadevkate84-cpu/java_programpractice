public class Arrayindex {
    public static void main(String[] args) {
        int a[]={20,30,40,50};
        try {
            System.out.println(a[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }

    }
}
