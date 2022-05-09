package Proxy.staticProxy;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/26
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Internet proxy = new RouterProxy();
        proxy.httpAccess("http://www.电影.com");
    }}
