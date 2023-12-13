public class MyNewThread implements Runnable {
    String name;
    Thread t;

    MyNewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 2; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "exit");
        }
        System.out.println(name + " 結束exiting !");

    }
}
