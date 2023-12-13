public class MyPoliteRunner extends Thread {
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
