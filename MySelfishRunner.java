public class MySelfishRunner extends Thread {
    private int tick = 1;
    private int num;

    public MySelfishRunner(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (tick < 4000000) {
            tick++;
            if ((tick % 50000) == 0) {
                System.out.println("Thread #" + num + ", tick = " + tick);
            }
        }
    }
}
