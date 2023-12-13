public class MyCounterThread extends Thread {
    int counter = 10;

    public MyCounterThread() {
    }

    @Override
    public void run() {
        // 執行緒執行的地方
        while (counter > 0) {
            System.out.println(counter);
            counter--;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String args[]) {
        MyCounterThread t1 = new MyCounterThread();
        MyCounterThread t2 = new MyCounterThread();

        t1.start();
        t2.start();
        // t1.start();
    }
}
