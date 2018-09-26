import java.util.concurrent.ExecutorService;
import static java.util.concurrent.Executors.newFixedThreadPool;

public class Main {
    private final static int QUANTITY_THREADS = 1000;
    private final static int QUANTITY_ITERATIONS = 1000;

    public static void main(String[] args) {
        ExecutorService service = newFixedThreadPool(QUANTITY_THREADS);

        for (int i = 0; i < QUANTITY_ITERATIONS; i++) {
            service.submit(new Connector());
        }
        service.shutdown();
    }
}
