package Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class streamMethods {
   public static Map<Integer, Integer> mapObject= new HashMap<>();
   public static List<Object> myList= new ArrayList<Object>();

    public long peek(Stream stream){
       // System.out.println(stream.filter(e->valueOf(e)%2==0).count());
       // stream.map(e->myList.add(e)).count();



        return stream.peek(e-> System.out.println("In method"+e)).map(Object::toString).peek(e-> System.out.println(e))
                .map(e->Integer.parseInt(String.valueOf(e))).peek(value->System.out.println(value)).count();
    }
}
