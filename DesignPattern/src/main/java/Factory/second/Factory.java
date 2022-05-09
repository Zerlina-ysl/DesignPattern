package Factory.second;

import Factory.Enemy;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/25
 * 核心类
 */
public interface Factory {
    Enemy create(int screenWidth);
}
