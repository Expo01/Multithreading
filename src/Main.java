public class Main {
    public static void main(String[] args) throws InterruptedException{

        MyThread thread1 = new MyThread(); //subclass of thread variant


        //implement Runnable interface and pass instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);


        thread1.start();
        //thread1.join(3000); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        // if no millisecond amount is specified, it defaults to only beginning next thread when the preceding thread dies
        thread2.start();

        System.out.println(1/0); // even though this will throw an exception, the other threads will run independent of this........
    }
}