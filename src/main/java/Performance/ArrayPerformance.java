package Performance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPerformance implements Performance{
    static int newarr[] = new int[100];

    public void initializeObject() {
        for (int i = 1; i < 100; i++)
            newarr[i] = i;
    }

    public void FunctionalStyle() {
        System.out.println(newarr.length);
        System.out.println(Arrays.stream(newarr).average());
    }

    public void ImperetiveStyle() {
        int n = 100;
        int sum = 0;
        float average;

        int a[] = new int[n];
        for (int i = 1; i < n; i++) {
            a[i] = i;
            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);
        average = (float) sum / n;
        System.out.println("Average:" + average);
    }
}
