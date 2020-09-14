package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapsWorking {
    public static void main(String[] args) {
//        The principal thing to notice is that Streams are sequences of elements
//        which can be easily obtained from a Collection.
//
//        Maps have a different structure, with a mapping from keys to values, without sequence.
//        This doesn't mean that we can't convert a Map structure into different sequences
//        which then allow us to work in a natural way with the Stream API.

        Map<String, Integer> someMap = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = someMap.entrySet();

        someMap.put("gaurav",1);someMap.put("Prerna",2);

        entries.stream().forEach((e)->{
            System.out.println(e.getKey()+" Value :: "+e.getValue());
            e.getKey();
            e.getValue();
        });
    }
}
