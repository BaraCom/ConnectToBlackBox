package black_box;

public class BlackBox {
    private int num = 0;

    public Long get() {
        long after = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            num++;
            num -= 12;
        }
        long before = System.currentTimeMillis();

        return before - after;
    }
}
