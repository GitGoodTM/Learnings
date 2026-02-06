public class MultiThreadingExample {
    public static void main(String[] args) {
        /* Multithreading enables a program to run multiple threads concurrently
        * Thread is to be considered as a set of instructions that run independently
        * This is useful for background tasks or time-consuming operations */

        // MyRunnable runnable =new MyRunnable();
        Thread threadShibu = new Thread(new MyRunnable("Shibu")); // separate runnable object creation will also work
        Thread threadSoman = new Thread(new MyRunnable("Soman")); // separate runnable object creation will also work

        System.out.println("Main Thread Start");

        //threadShibu.start();
        //threadSoman.start();

        try {
            threadShibu.join();
            threadSoman.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main Thread End");
    }
}
