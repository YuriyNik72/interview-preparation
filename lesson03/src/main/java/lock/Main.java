package lock;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.startIncrement();
        System.out.println(counter.getValue());
    }
}
