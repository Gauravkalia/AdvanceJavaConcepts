//package Car;
//
//import Interfaces.BodyType;
//import Interfaces.Engine;
//import Interfaces.MuscelCar;
//import Interfaces.Tyres;
//
//public class CarBody {
//
//    public static void main(String[] args) {
//
//        car obj = new car();
//        obj.innerClassExample();
//
//        //Anonymous Inner class
////        car carObj = new car(){
////          public void innerClassExample(){
////              System.out.println(this.getClass());
////              System.out.println("Dark class");
////            }
////        };
////        carObj.innerClassExample();
//
//
//
//
//
//
//        //Familier
//        Engine engineObje = e -> {
//            return e;
//        };
//        System.out.println(engineObje.power(5));
//
//        Engine enginePower = e -> {
//            return e;
//        };
//
//        System.out.println(enginePower.power(5));
//
//        Engine DoublePower = e -> {
//            return e * 2;
//        };
//
//        BodyType body = e -> {
//            return e;
//        };
//        Tyres tyreObj = e -> {
//            return e;
//        };
//      // System.out.println(enginePower.test(4));
//        tyreObj.test();
//    }
//
//}
