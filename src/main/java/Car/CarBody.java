package Car;

import Interfaces.BodyType;
import Interfaces.Engine;
import Interfaces.MuscelCar;
import Interfaces.Tyres;

public class CarBody {

    public static void main(String[] args) {
        Engine enginePower = e -> {
            return e;
        };
        Engine DoublePower = e -> {
            return e * 2;
        };

        BodyType body = e -> {
            return e;
        };
        Tyres tyreObj = e->{
          return e;
        };
        enginePower.test();
        tyreObj.test();
    }

}
