package Collections;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Boolean.valueOf;

public class List<S> {

    public static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");


       // System.out.println(l);

//        addValuesToArrayList(arrayList);
//        printValues(arrayList.stream());
//        giveEven(arrayList.stream());
//
//        //Integer Value
//        System.out.println(getInteger(arrayList.stream()));
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

    public static void giveEven(Stream<String> stream){

       java.util.List<Integer> x=  stream.map(Integer::new).filter(e-> e%2==0).collect(Collectors.toList());
        x.stream().forEach(System.out::println);

    }

}
