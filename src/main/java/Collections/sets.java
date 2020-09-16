package Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class sets {

    static Set<Integer> s = new HashSet<Integer>();

    public static void main(String[] args) {
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

       List<String> l= s.stream().map(e->e.toString()).collect(Collectors.toList());
        System.out.println(l.size());

    }
}
