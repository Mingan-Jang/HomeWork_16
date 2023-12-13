public class MyThreadTemplate extends Thread {
    public static boolean ready = false;

    public MyThreadTemplate() {
        super("BT1");
        // 預設優先權為5
    }

    public MyThreadTemplate(String name) {
        super(name);
    }

    public MyThreadTemplate(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public MyThreadTemplate(String name, int priority, boolean isDaemon) {
        super(name);
        setPriority(priority);
        setDaemon(isDaemon);
    }

    public void run() {
        while (!ready) {
            // 起跑時間不一致，消除啟動時間不一致
        }
        // 只要沒開跑，就不執行下一行。

        System.out.println(
                "My name is " + getName()
                        + "..... My priority is " + getPriority()
                        + "..... Am I alive? " + isAlive()
                        + "..... Am I daemon? " + isDaemon());
        String nameOfcurrentThread = Thread.currentThread().getName();
        System.out.println("目前正在執行的執行緒的名字=" + nameOfcurrentThread);

    }

}
