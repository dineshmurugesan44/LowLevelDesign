package singeletonMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main2 {
    public static void main(String[] args) {



        Runnable runnable = ()->{
            DatabaseConnection db = DatabaseConnection.getInstance();
            System.out.println(db);
            System.out.println(Thread.currentThread().getName());

        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
