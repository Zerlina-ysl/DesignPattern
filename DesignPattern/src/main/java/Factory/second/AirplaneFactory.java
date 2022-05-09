package Factory.second;


import Factory.AirPlane;
import Factory.Enemy;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class AirplaneFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random();

        return new AirPlane(random.nextInt(screenWidth),0);
    }
}
