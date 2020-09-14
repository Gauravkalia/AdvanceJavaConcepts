package Interfaces;

public interface Tyres {
    public String tyreType(String tyres);
    default public void test() {
        System.out.println("hi there in tyre interface");
    }
}
