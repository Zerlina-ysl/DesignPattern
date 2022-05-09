package Factory;

import Factory.first.SimpleFactory;
import Factory.second.AirplaneFactory;
import Factory.second.BossFactory;
import Factory.second.Factory;
import Factory.second.TankFactory;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("游戏开始。。。");

        int screenWidth=100;
//        Random random = new Random();
//        int x = random.nextInt(screenWidth);
//        Enemy airplane = new AirPlane(x,0);
//        airplane.show();
//
//
//         x = random.nextInt(screenWidth);
//        Tank tank = new Tank(x,0);
//        tank.show();

//
//        SimpleFactory factory = new SimpleFactory(100);
//        factory.create("Airplane").show();
//        factory.create("Tank").show();

        Factory factory = new TankFactory();
        for(int i=0;i<5;i++){
            factory.create(screenWidth).show();
        }
        factory=new AirplaneFactory();
        for(int i=0;i<5;i++){
            factory.create(screenWidth).show();
        }
        System.out.println("抵达");
        factory= new BossFactory();
        factory.create(screenWidth).show();

    }
}
