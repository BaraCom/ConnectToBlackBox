package black_box;

public class BlackBox {
    private int num = 0;

    public void getBlackBoxResult() {
        for (int i = 0; i < 1_000_000; i++) {
            num++;

            for (int j = 0; j < 1_000; j++) {
                num++;
            }
        }
    }
}
