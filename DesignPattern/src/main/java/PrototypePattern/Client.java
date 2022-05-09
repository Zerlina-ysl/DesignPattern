package PrototypePattern;

/**
 * Created by IntelliJ IDEA.
 * User: luna
 * Date: 2022/4/5
 */
public class Client {
    //原型对象
    private ConcretePrototype prototype = new ConcretePrototype();

    //克隆对象
    private ConcretePrototype clone;

    public void operation()  {
        try {
            clone = (ConcretePrototype)prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //false
        System.out.println(clone==prototype);

        //true
        System.out.println(clone.getClass()==prototype.getClass());

        //false
        System.out.println(clone.equals(prototype));
    }

    public static void main(String[] args) {
        new Client().operation();
    }

}
