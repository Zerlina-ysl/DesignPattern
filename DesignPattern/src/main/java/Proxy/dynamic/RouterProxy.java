package Proxy.dynamic;

import Proxy.Modem;
import Proxy.staticProxy.Internet;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/26
 */
public class RouterProxy implements Internet {


    //被代理对象
    private Internet modem;

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");

    }

    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}
