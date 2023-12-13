public class Animal {
    private int age;
    private float weight;

    Animal(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public void speak() {
        System.out.println("Age" + this.age + " Weight" + this.weight);
    }
}
