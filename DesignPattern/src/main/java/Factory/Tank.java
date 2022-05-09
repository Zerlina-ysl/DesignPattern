package Factory;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class Tank extends Enemy {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制坦克于上层图层，发现坐标："+x+","+y);
        System.out.println("坦克向玩家发起攻击...");
    }
}
