package CybageSittingPlan;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Readfile {
    public static String readFile() throws Exception {
//        FileReader fr = new FileReader("D:\\PracticeLanguages-20200913T125959Z-001\\" +
//                "PracticeLanguages\\" +
//                "GitHubProjects\\AdvanceJavaPractice\\src\\main\\java\\CybageSittingPlan\\pojo\\employJson.txt");
//        int i;
//        String s = "";
//
//        while((i=fr.read())!=-1)
//            s.concat(String.valueOf(i));
//        fr.close();

        File file = new File("D:\\PracticeLanguages-20200913T125959Z-001\\PracticeLanguages\\" +
                "GitHubProjects\\AdvanceJavaPractice\\" +
                "src\\main\\java\\CybageSittingPlan" +
                "\\pojo\\employ.json");

//        BufferedReader br = new BufferedReader(new FileReader(file));
//        String FinalString = "";
//        String st;
//
//
//
//        while ((st = br.readLine()) != null)
//            FinalString.concat(st);


        String data = readFileAsString("D:\\PracticeLanguages-20200913T125959Z-001\\PracticeLanguages\\GitHubProjects\\AdvanceJavaPractice\\src\\main\\java\\CybageSittingPlan\\pojo\\employ.json");
        System.out.println(data);
        return data;
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

}
