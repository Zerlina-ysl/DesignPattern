package Factory.first;


import Factory.AirPlane;
import Factory.Enemy;
import Factory.Tank;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class SimpleFactory {

    private  int screenWidth;

    private Random random;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;

    }
    public Enemy create(String type){
        int x = random.nextInt(screenWidth);
        Enemy enemy=null;
        switch (type){
            case "Airplane":
                enemy = new AirPlane(x,0);
                break;
            case "Tank" :
                enemy=new Tank(x,0);
                break;
        }
        return  enemy;
    }
}
