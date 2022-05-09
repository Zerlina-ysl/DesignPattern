package Factory.second;

import java.util.Random;

import Factory.Enemy;

import Factory.Tank;



/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class TankFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random();
        return new Tank(random.nextInt(screenWidth),0);
    }
}
