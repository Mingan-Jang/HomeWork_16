public class TestMySelfishRunner {
    private final static int NUMRUNNERS = 2;

    public static void main(String[] args) {
        MySelfishRunner[] runners = new MySelfishRunner[NUMRUNNERS];

        for (int i = 0; i < NUMRUNNERS; i++) {
            runners[i] = new MySelfishRunner(i);
            runners[i].setPriority(2);
        }
        for (int i = 0; i < NUMRUNNERS; i++)
            runners[i].start();
    }
}
