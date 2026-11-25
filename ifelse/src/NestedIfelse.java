public class NestedIfelse
{
    public static void main(String[] args) {
       int age = 19;
       String city = "pune";

       if(age>18){
           if(city=="csn"){
               System.out.println("you can vote");
           }
           else{
               System.out.println("your not from csn");
           }
       }
       else{
           System.out.println("you age  not ");
       }
    }
}
