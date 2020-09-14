package Collections;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Boolean.valueOf;

public class List<S> {

    public static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        addValuesToArrayList(arrayList);
        printValues(arrayList.stream());

        //Integer Value
        System.out.println(getInteger(arrayList.stream()));
    }

    public static ArrayList<String> addValuesToArrayList(ArrayList<String> someObj) {
        someObj.add("1");
        someObj.add("2");
        return someObj;
    }

    public static void printValues(Stream<String> stream) {
        stream.forEach(System.out::println);
    }
    public static java.util.List<Integer> getInteger(Stream<String> stream){
       java.util.List<Integer> x;
      return  x = stream.map(Integer::new).collect(Collectors.toList());
    }

}
