public class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        // 建構子內即同時建構執行緒
        System.out.println("New thread: " + t); // 並印出該執行緒相關資料
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exit()");
    }
}
