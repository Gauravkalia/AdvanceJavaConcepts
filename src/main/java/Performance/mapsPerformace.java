package Performance;

import java.util.*;
import java.util.stream.Collectors;

public class mapsPerformace implements Performance {
    @Override
    public void ImperetiveStyle() {
        Map<Integer, Integer> someMap = new HashMap<>();
      //  Set<Map.Entry<Integer, Integer>> entries = someMap.entrySet();
        someMap.put(2,12);
        someMap.put(3,22);
        someMap.put(11,23);
        someMap.put(4,21);
       List<Integer> l1 = new LinkedList<>();
        for(Map.Entry<Integer,Integer> m1:someMap.entrySet()){
            if(m1.getValue()%2==0){
                l1.add(m1.getValue());
            }
        }
        System.out.println(l1.size());
    }

    @Override
    public void FunctionalStyle() {
        Map<Integer, Integer> someMap = new HashMap<>();
        Set<Map.Entry<Integer, Integer>> entries = someMap.entrySet();
        someMap.put(2,12);
        someMap.put(3,22);
        someMap.put(11,23);
        someMap.put(4,21);
        List<?> even = entries.stream().filter(e->e.getValue()%2==0).collect(Collectors.toList());
        System.out.println(even.size());
    }
}
