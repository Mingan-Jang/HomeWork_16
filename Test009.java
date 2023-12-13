import java.util.ArrayList;

public class Test009 {
    public static void main(String[] args) {

        Object person = new Person("123", 220);
    }

    // static context
    static class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
    }

}
