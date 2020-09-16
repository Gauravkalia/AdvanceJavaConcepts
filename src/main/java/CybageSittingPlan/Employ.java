package CybageSittingPlan;

import Collections.listMoreMethods;
import CybageSittingPlan.pojo.emp;
import com.google.gson.Gson;

import java.util.*;

public class Employ {
//    public void raa(String name, int deskNo, String birthdaybrings) {
//        cybagian cybagianObject = new cybagian();
//        cybagianObject.desk(deskNo);
//        cybagianObject.name(name);
//        cybagianObject.birthdaybrings(birthdaybrings);
//    }

    public void row() throws Exception {

        String employJson = Readfile.readFile();

        Gson gson = new Gson();
        emp userArray = gson.fromJson(employJson, emp.class);

        //Using streams/Functional
        Long from = listMoreMethods.getDate();
//

        userArray.getEmploy().stream().forEach(e-> System.out.println(e.getName()));

//        userArray.getEmploy().stream().
//                filter(e -> e.getDeskNo() % 2 == 0).
//                forEach(e -> System.out.println(e.getDeskNo() + " -> " + e.getName()));


        //Using familier Imperitive style
   //     Long from = listMoreMethods.getDate();
//        for (int i = 0; i < userArray.getEmploy().size(); i++) {
//            if (userArray.getEmploy().get(i).getDeskNo() % 2 == 0) {
//                System.out.println(userArray.getEmploy().get(i).getDeskNo() + " -> " + userArray.getEmploy().get(i).getName());
//            }
//            //System.out.println(userArray.getEmploy().get(i));
//        }

        Long to = listMoreMethods.getDate();
        System.out.println(to-from);
    }
}
