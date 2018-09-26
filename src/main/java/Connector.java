import black_box.BlackBox;
import java.util.concurrent.Callable;
import static java.lang.Thread.currentThread;

public class Connector implements Callable<String> {

    @Override
    public String call() {
        System.out.println(currentThread().getName() + " is starting...");

        long startTime = System.currentTimeMillis();
        new BlackBox().getBlackBoxResult();
        long finishTime = System.currentTimeMillis();

        System.out.println(currentThread().getName()
                        + " is finished... Spent "
                        + (finishTime - startTime)
                        + " millis.");

        return currentThread().getName();
    }
}
