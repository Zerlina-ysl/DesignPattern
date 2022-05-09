package Factory.second;

import Factory.Enemy;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class Boss extends Enemy {
    public Boss(int x,int y) {
        super(x,y);
    }

    @Override
    public void show() {
        System.out.println("boss于上层图层，发现坐标："+x+","+y);
        System.out.println("boss向玩家发起攻击...");

    }
}
