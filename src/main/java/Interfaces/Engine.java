package Interfaces;

@FunctionalInterface
public interface Engine {
    public int power(int x);

    default public void test() {
        System.out.println("hi there in interface");
    }
}
