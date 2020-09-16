package Performance;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListPerformance implements Performance {

    @Override
    public void ImperetiveStyle() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            count = count + i;
        }
        System.out.println(count);
    }

    @Override
    public void FunctionalStyle() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        AtomicInteger count = new AtomicInteger();
        arrayList.stream().forEach(e->{
            count.set(e + count.get());
        });
        System.out.println(count);
    }
}
