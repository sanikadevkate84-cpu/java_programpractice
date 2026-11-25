public class DemoException {
  public  static void main(String[] args) {
//
      DemoException d = new DemoException();
      try{
          d.divide(12,0);
      } catch (ArithmeticException e) {
          System.out.println(e.getMessage());
      }
      finally {
          System.out.println("finally execute" );


      }

    }


    public float divide(int a , int b) throws ArithmeticException{
      return a / b;
    }
}