package Car;

import Interfaces.Engine;

public class car1 {
//    @Override
//    public int power(int x) {
//        System.out.println(x);
//        System.out.println(this.getClass());
//        return x;
//    }

    public static void main(String[] args) {
//        car1 ca = new car1();
//        ca.power(4);
//            Engine eng = (e) -> {
//                    System.out.println(e);
//                    return 0;
//            };
//           eng.power(3);
        Runnable run = () -> {
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        };
        for (int i = 0; i < 20; i++) {
            run.run();
        }



    }

}
