public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

public void main(String[] args) {
    MyThread mt=new MyThread();
    mt.start();
}
