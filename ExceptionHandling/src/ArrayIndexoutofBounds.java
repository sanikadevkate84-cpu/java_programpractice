public class ArrayIndexoutofBounds {
    static void main(String[] args) {
        int a[]={10,20,30};
        try{
            System.out.println(a[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
