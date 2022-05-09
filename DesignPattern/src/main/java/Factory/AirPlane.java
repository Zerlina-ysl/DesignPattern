package Factory;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class AirPlane extends  Enemy{
    public AirPlane(int x,int y) {
        super(x,y);
    }

    @Override
    public void show() {
        System.out.println("绘制飞机于上层图层，发现坐标："+x+","+y);
        System.out.println("飞机向玩家发起攻击...");
    }
}
