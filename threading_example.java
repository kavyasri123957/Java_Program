import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    public void run() {
        System.out.println("Task executed by: " + Thread.currentThread().getName());
    }
}

public class threading_example {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i < 5; i++) {
            Task task = new Task();   
            executor.execute(task);  
        }

        executor.shutdown(); 
    }
}