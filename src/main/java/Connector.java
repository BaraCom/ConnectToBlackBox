import black_box.BlackBox;
import java.util.concurrent.Callable;

public class Connector {
    private BlackBox blackBox;
    private static int counter = 0;

    public Callable runThread() {
        Callable task = () -> {
            blackBox = new BlackBox();

            Long threadResult = blackBox.get();
            System.out.println(threadResult + " millis. Complete.");

            return threadResult;
        };
        counter++;
        System.out.println(counter);

        return task;
    }
}
