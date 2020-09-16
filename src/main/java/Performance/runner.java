package Performance;

import static Collections.listMoreMethods.getDate;

public class runner {

    public static void main(String[] args) {
        //Array
//        ArrayPerformance p = new ArrayPerformance();
//        Long StartTime = getDate();
//        p.initializeObject();
//        p.FunctionalStyle();
//        Long EndTime = getDate();
//        System.out.println("func :: "+ (EndTime-StartTime));
//
//        Long StartTimeI = getDate();
//        p.ImperetiveStyle();
//        Long EndTimeI = getDate();
//        System.out.println("func Imperetive :: "+ (EndTimeI-StartTimeI));

        //ArrayList
//        ArrayListPerformance ap = new ArrayListPerformance();
//        Long StartTimeArrayList = getDate();
//        ap.FunctionalStyle();
//        Long EndTimeArrayList = getDate();
//        System.out.println("func :: "+ (EndTimeArrayList-StartTimeArrayList));
//        Long StartTimeIArrayList = getDate();
//        ap.ImperetiveStyle();
//        Long EndTimeIArrayList = getDate();
//        System.out.println("Imp :: "+ (EndTimeIArrayList-StartTimeIArrayList));

        //mapsPerformance
//        mapsPerformace mapObj = new mapsPerformace();
//        Long StartTimeMap = getDate();
//        mapObj.FunctionalStyle();
//        Long EndTimeMap = getDate();
//        System.out.println("func :: " + (EndTimeMap - StartTimeMap));
//        Long StartTimeIMap = getDate();
//        mapObj.ImperetiveStyle();
//        Long EndTimeIMap = getDate();
//        System.out.println("Imp :: " + (EndTimeIMap - StartTimeIMap));

        //Quadratic Performance
    //for one hundred million records 100000000
//func :: 57518
//Imp :: 18557

    //Parallel vs Non parallel Streams for one hundred million records i.e 100000000 records
//func :: 13969
//Imp :: 15689
        StreamsPerformanceTest r = new StreamsPerformanceTest();

        Long StartTimeRandom = getDate();
        r.FunctionalStyle();
        Long EndTimeRandom = getDate();
        System.out.println("func :: " + (EndTimeRandom - StartTimeRandom));
        Long StartTimeIRandom = getDate();
        r.ImperetiveStyle();
        Long EndTimeIRandom = getDate();
        System.out.println("Imp :: " + (EndTimeIRandom - StartTimeIRandom));

    }
}
