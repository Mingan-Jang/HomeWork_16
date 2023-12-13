import java.util.Iterator;

// 自定义 Iterable 对象
class MyIterable implements Iterable<Integer> {
    private int[] data;

    public MyIterable(int[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    // 自定义 Iterator 对象
    private class MyIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public Integer next() {
            return data[index++];
        }
    }
}

public class InteratorTest {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        // 使用 Iterable 对象
        MyIterable myIterable = new MyIterable(array);

        // 使用 Iterator 进行迭代
        for (int num : myIterable) {
            System.out.println(num);
        }
    }
}
