package Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapsWorking {
    public static Map<String, Integer> mapToEdit = new HashMap<>();
    public static Set<Map.Entry<String, Integer>> entries2 = new HashSet<>();

    public static void main(String[] args) {
//        The principal thing to notice is that Streams are sequences of elements
//        which can be easily obtained from a Collection.
//
//        Maps have a different structure, with a mapping from keys to values, without sequence.
//        This doesn't mean that we can't convert a Map structure into different sequences
//        which then allow us to work in a natural way with the Stream API.
//
//        Map<String, Integer> someMap = new HashMap<>();
//        Set<Map.Entry<String, Integer>> entries = someMap.entrySet();
//
//        someMap.put("jack",1);someMap.put("bruce",2);
//
//        for(Map.Entry<String, Integer> e: someMap.entrySet()){
//            System.out.println(e.getKey()+" value :: "+e.getValue());
//        }
//        for(int i=0;i<someMap.size();i++){
//            System.out.println();
//        }
//
//        printMap(entries);
//        addToMap(entries);
//        System.out.println(entries2.size());
//        System.out.println("----");
//
//        for(Map.Entry<String, Integer> i:mapToEdit.entrySet()){
//            System.out.println(i.getKey() +" value "+i.getValue());
//        }
//        reduceOperations();
//        insertingValuesToMoreThanOneMap();

        Map<String, String> m = new HashMap<>();
        m.put("1","Gaurav");
        m.put("2", "vaibhav");
        Set<Map.Entry<String, String>> s = m.entrySet();


        s.stream().forEach(e->{
            System.out.println(e.getKey()+" value : "+ e.getValue());
        });

    }

    public static void printMap(Set<Map.Entry<String, Integer>> entries) {
        entries.forEach((e) -> {
            System.out.println(e.getKey() + " Value :: " + e.getValue());
            e.getKey();
            e.getValue();
        });

    }

    public static void addToMap(Set<Map.Entry<String, Integer>> entries) {
        entries2 = entries.stream().collect(Collectors.toSet());

        mapToEdit = entries.stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }

    public static void reduceOperations() {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(4);
        intList.add(5);

        System.out.println(intList.stream().reduce(1, (e, i) -> {
            System.out.println("value of e " + e + " value of i" + i);
            return e + i;
        }));
    }

    public static void insertingValuesToMoreThanOneMap() {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        Map<Integer, Integer> m3 = new HashMap<>();
        m1.put(1, 24);
        m1.put(2, 34);
        m1.put(3, 45);

        Set<Map.Entry<Integer, Integer>> s1 = m1.entrySet();
        //s1.addAll((Collection<? extends Integer>) m1);
        m2 = s1.stream().collect(Collectors.toMap(e -> {
                    return e.getKey();
                }, e -> e.getValue())
        );
        for (Map.Entry<Integer, Integer> entry : m2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
