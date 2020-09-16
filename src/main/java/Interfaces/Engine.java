package Interfaces;

@FunctionalInterface
public interface Engine {
    int x = 0;
    public int power(int x);
   // public void size();
    default public int test(int x) {
        System.out.println("hi there in interface");
        return x;
    }
}
