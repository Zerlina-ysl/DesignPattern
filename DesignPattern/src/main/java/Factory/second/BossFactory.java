package Factory.second;

import Factory.Enemy;
/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 */
public class BossFactory implements Factory {
    @Override
    public Enemy create(int screenWidth) {
        return new Boss(screenWidth/2,0);
    }
}
