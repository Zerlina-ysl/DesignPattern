package Single;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/5/3
 */
public class SingleTon {
    //双重非空判断+synchronized+volatile
//    public volatile SingleTon instance = null;
//    public SingleTon getInstance(){
//        if(instance==null){
//            synchronized (this){
//                if(instance==null){
//                    instance=new SingleTon();
//                }
//            }
//        }
//        return instance;
//    }

    //静态代码块
//    public static SingleTon instance=null;
//    static{
//        instance = new SingleTon();
//    }
//    public static SingleTon getInstance(){
//        return instance;
//    }

    //内部类.属性
//    public static class SingleTonInner{
//        private static SingleTon instance = new SingleTon();
//    }
//    public static SingleTon getInstance(){
//        return SingleTonInner.instance;
//    }

//枚举
   enum SingleTonEnum{
        INSTANCE;
    }
}

