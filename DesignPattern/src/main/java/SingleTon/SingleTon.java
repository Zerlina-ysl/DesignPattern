package SingleTon;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/3/27
 */

/**
 * 饿汉式加载 容易造成内存浪费
 */
public class SingleTon {
    public static SingleTon instance = new SingleTon();
    private SingleTon(){}
    public static SingleTon getInstance(){
        return instance;
    }


}

/**
 * 线程不安全
 */
class SingleTonLazy{
    public static SingleTonLazy singleTon=null;

    private SingleTonLazy() {
    }
    public static SingleTonLazy getInstance(){
        if(singleTon==null){
            //多个含有null singleTon的线程同时进入 创造多个singleTon 对象
            singleTon=new SingleTonLazy();
        }
        return  singleTon;
    }
}

/**
 * 线程安全的懒汉式
 */
class SingleTonSafe{
    public static SingleTonSafe singleTon = null;

    private SingleTonSafe() {
    }
    //synchronized加在方法上 会导致效率低
    public static synchronized SingleTonSafe getInstance(){
           if(singleTon==null){
                singleTon= new SingleTonSafe();
            }

        return singleTon;
    }
}

/**
 * DCL双检查锁机制 但会因为指令重排而造成线程不安全
 *  1- memory=allocate() 堆空间中分配内存 指定地址
 *  2- 类加载的顺序初始化对象
 *  3- instance=memory 设置instance指向刚分配的内存地址 存在栈中
 *  指令重排序 可能 1->3->2
 *  即A线程 singleTon=new Singleton() 指向刚分配的内存
 *  B线程if(instance==null) 判断有值 直接return singleTon
 *  即未初始化的对象可能被B线程拿去使用
 *
 */
class SingleTonUnSafeAndEfficient{
    public static SingleTonUnSafeAndEfficient singleTon = null;

    private SingleTonUnSafeAndEfficient() {
    }
    public static SingleTonUnSafeAndEfficient getInstance(){
        if(singleTon==null){
            //缩小锁的范围
            synchronized (SingleTonUnSafeAndEfficient.class){
               if(singleTon==null){
                   singleTon=new SingleTonUnSafeAndEfficient();
               }
            }
        }
        return singleTon;
    }
}

/**
 * 防止重排序
 */
class SingleTonSafeAndEffient{
    public static volatile SingleTonSafeAndEffient singleTon = null;

    private SingleTonSafeAndEffient() {
    }
    public static SingleTonSafeAndEffient getInstance(){
        if(singleTon==null){
            //缩小锁的范围
            synchronized (SingleTonSafeAndEffient.class){
                if(singleTon==null){
                    singleTon=new SingleTonSafeAndEffient();
                }
            }
        }
        return singleTon;
    }
}


class SingleTonStatic{
    public static SingleTonStatic instance =null;
    //使用静态代码块
    static{
        instance=new SingleTonStatic();
    }

    //私有化构造方法
    private SingleTonStatic() {
    }
    public static SingleTonStatic getInstance(){
        return instance;
    }
}

/**
 * 延迟加载+线程安全 但是可能会受到反序列化攻击
 */
class SingleTonIn{
    private SingleTonIn() {
    }
    private static class SingleTonInner{
        private static  SingleTonIn instance = new SingleTonIn();
    }
    public static SingleTonIn getInstance(){
        return SingleTonInner.instance;
    }
}


/**
 枚举 直接SingleTonEnum.INSATNCE调用
 */
enum SingleTonEnum{
    INSTANCE;
}