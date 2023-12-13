public record TestMyThreadTemplate() {
    public static void main() {
        MyThreadTemplate[] nt = new MyThreadTemplate[] {
                new MyThreadTemplate(),
                new MyThreadTemplate("NT2", 2),
                new MyThreadTemplate("NT3", 3),
                new MyThreadTemplate("NT6", 6, true),
                new MyThreadTemplate("NT9", 9, true)
        };

        for (int i = 0; i < nt.length; i++) {
            nt[i].start();
            // 起跑時間不一致，消除啟動時間不一致

            // 將執行緒物件中的ready變數設為true時，
            // 才會離開永久迴圈而執行下去
        }
        MyThreadTemplate.ready = true;
    }
}
