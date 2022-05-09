package Proxy.dynamic;

import Proxy.staticProxy.Internet;

import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/26
 */
public class Client {

    public static void main(String[] args) throws Exception {
       Internet internet = (Internet) Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy())
        );


       internet.httpAccess("http://www.电影.com");




       Intranet intranet = (Intranet)Proxy.newProxyInstance(
               //代理对象
               Switch.class.getClassLoader(),
               Switch.class.getInterfaces(),
               //过滤器对象
               new BlackListFilter(new Switch())
       );
       intranet.fileAccess("\\\\192.168.1.2\\共享\\电影\\IronHuman.mp4");
    }}
