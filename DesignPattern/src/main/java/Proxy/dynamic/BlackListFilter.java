package Proxy.dynamic;

import javafx.beans.InvalidationListener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/26
 */
public class BlackListFilter implements InvocationHandler {

    private List<String> blackList = Arrays.asList("电影","游戏","小说","音乐");

    //被代理的真实对象
    private Object origin;

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = args[0].toString();
        for(String keyword:blackList){
            if(arg.contains(keyword)){
                System.out.println("禁止访问："+arg);
                return null;
            }
        }
        System.out.println("效验通过...");
        //调用被代理对象方法
        return method.invoke(origin,arg);
    }
}
