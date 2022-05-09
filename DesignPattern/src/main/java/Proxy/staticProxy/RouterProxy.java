package Proxy.staticProxy;

import Proxy.Modem;



import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/26
 */
public class RouterProxy implements Internet{

    //被代理对象
    private Internet modem;

    private List<String> blacklist = Arrays.asList("电影","游戏","音乐","小说");

    public RouterProxy() throws Exception {
        //实例化被代理类
        this.modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {

        for(String keyword:blacklist){
            if(url.contains(keyword)){
                System.out.println("禁止访问"+url);
                return ;
            }
        }
        //转发请求
        modem.httpAccess(url);
    }
}
