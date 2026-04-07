import java.util.concurrent.*;
class singthread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
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