package Performance;

import java.util.ArrayList;

public class StreamsPerformanceTest implements Performance {
    @Override
    public void ImperetiveStyle() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            a.add(i);
        }
        a.stream().forEach((n) -> {
            //     System.out.println(n);
            int fact = 0;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        });
//        a.forEach((n) -> {
//            //System.out.println(n);
//            int fact = 0;
//            for (int i = 1; i <= n; i++) {
//                fact = fact * i;
//            }
//        });
    }

    @Override
    public void FunctionalStyle() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            a.add(i);
        }
        a.stream().parallel().forEach((n) -> {
       //     System.out.println(n);
            int fact = 0;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        });
    }
}
