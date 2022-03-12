class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from thread");
    }
}
public class thread {
    public static void main(String[] args){
        Thread t = new Thread(new MyThread());
        //t.start();
        t.run();
        System.out.println("Finish main");
    }
}
