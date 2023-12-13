public class TestMyPoliteRunner {
    private final static int NUMRUNNERS = 2;

    public static void main(String[] args) {
        MyPoliteRunner[] runners = new MyPoliteRunner[NUMRUNNERS];

        for (int i = 0; i < NUMRUNNERS; i++) {
            runners[i] = new MyPoliteRunner(i);
            runners[i].setPriority(2);
        }
        for (int i = 0; i < NUMRUNNERS; i++)
            runners[i].start();
    }
}

class MyPoliteRunner extends Thread {
    private int tick = 0;
    private int num;

    public MyPoliteRunner(int num) {
        this.num = num;
    }

    public void run() {
        while (tick < 4000000) { // 原來為400000
            tick++;
            if ((tick % 50000) == 0) {
                System.out.println("Thread #" + num + ", tick = " + tick);
                Thread.yield();
            }
        }
    }
}
