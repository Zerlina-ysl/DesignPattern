package Factory;

import Factory.second.Factory;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public abstract class Enemy {
    protected  int x;

    protected  int y;


    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract  void show();
}
