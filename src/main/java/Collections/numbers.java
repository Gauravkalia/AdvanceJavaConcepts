package Collections;

import java.util.stream.IntStream;

public class numbers {

    public static void num() {
        IntStream a = IntStream.range(1, 10);
        //a.forEach(System.out::println);
        //a.filter(e->e%2==0).forEach(System.out::println);
        System.out.println(a.count());

    }

    public static void main(String[] args) {
        numbers.num();
    }
}
