package Interfaces;

public interface MuscelCar extends BodyType, Engine, Tyres {

    @Override
    default String bodyMaterial(String material) {
        return null;
    }

    @Override
    default int power(int x) {
        return 0;
    }

    @Override
    default void test() {

    }

    @Override
    default String tyreType(String tyres) {
        return null;
    }
}
