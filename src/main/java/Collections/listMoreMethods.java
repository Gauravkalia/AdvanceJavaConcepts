package Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
import java.util.stream.Stream;

import static java.lang.Boolean.valueOf;

public class listMoreMethods {
    //public static ArrayList<Integer> IntegerarrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    public static ArrayList<Integer> IntegerarrayList = new ArrayList<>();

    public static void main(String[] args) {
        //  System.out.println(IntegerarrayList.stream().count());
        addValuesToArrayList(IntegerarrayList);

        Long StartTime = getDate();
        doSomething(IntegerarrayList.stream());
        Long endTime =  getDate();
        System.out.println(endTime-StartTime);
    }

    public static long getDate() {
        Date date = new Date();
        long timeMilli = date.getTime();
        return timeMilli;
    }

    public static ArrayList<Integer> addValuesToArrayList(ArrayList<Integer> someObj) {
        someObj.add(1);
        someObj.add(2);
        someObj.add(3);
        someObj.add(1);
        someObj.add(2);
        someObj.add(3);
        return someObj;
    }

    public static void doSomething(Stream<Integer> stream) {
        // System.out.println(stream.filter(e -> e % 2 == 0).count());

        stream.parallel().filter(e -> e % 2 == 0).forEach(e -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            System.out.println(e);
        });
    }


}
