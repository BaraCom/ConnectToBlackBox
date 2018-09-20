import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import static java.util.concurrent.Executors.newFixedThreadPool;

public class Main {
    private final static int QUANTITY_THREADS = 1;

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = newFixedThreadPool(QUANTITY_THREADS);

        long after = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Callable callable = new Connector().runThread();

            Future future = executorService.submit(callable);
            future.get();
        }
        long before = System.currentTimeMillis();

        System.out.println("------------");
        System.out.println(before - after + " millis. Total difference.");
        executorService.shutdown();
    }
}
