package Collections;

import Factory.streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class peekFilterMap {

//peek is not so preferable, not working with java 9 unless you have filter()
//You can do same work in foreach()

    public static void main(String[] args) {
        ArrayList<Integer> addedvlaues = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        ArrayList<Integer> values = new ArrayList<Integer>();

        addedvlaues.stream().forEach(e -> {
            if (e % 2 == 0) {
                values.add(e);
            }
        });

        System.out.println(values.size());

        for(int i:values){
            System.out.println(i);
        }

        // streamMethods example = new streamMethods();
        // System.out.println(example.peek(addedvlaues.stream()));

//       Long x =  addedvlaues.stream().peek(e-> System.out.println("In method"+e)).map(Object::toString).peek(e-> System.out.println(e))
//                .map(e->Integer.parseInt(String.valueOf(e))).peek(value->System.out.println(value)).count();
//        System.out.println(x);
//         Stream.of(1,2,34).filter(e->e>12).map(e->addedvlaues.add(e)).count();
//       // System.out.println(test);
//        System.out.println("Values inside List"+addedvlaues);


        // System.out.println(test);
        // System.out.println("Values inside List"+addedvlaues);
    }

}
