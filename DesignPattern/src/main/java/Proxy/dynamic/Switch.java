package Proxy.dynamic;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/26
 */
public class Switch implements Intranet{
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网："+path);
    }
}
