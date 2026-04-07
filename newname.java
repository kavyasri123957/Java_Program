import java.util.concurrent.*;
class q14 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++) {
            int taskId = i;

            executor.execute(() -> {
                System.out.println("Executing Task " + taskId + 
                                   " by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}