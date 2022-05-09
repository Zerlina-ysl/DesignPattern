##过程细化
* 最初没有使用设计模式，每次都需要随机生成，且要制定类。
* 简单工程模式
```java
        int screenWidth=100;
        Random random = new Random();
        int x = random.nextInt(screenWidth);
        Enemy airplane = new AirPlane(x,0);
        airplane.show();


         x = random.nextInt(screenWidth);
        Tank tank = new Tank(x,0);
        tank.show();
```

* 加入简单工厂类，针对传入的类名直接封装一个show功能的函数。但是仍需要告知type才能产出，只是转移了耦合。
* 工厂方法模式
```java
  Factory factory = new TankFactory();
        for(int i=0;i<5;i++){
            factory.create(screenWidth).show();
        }
        factory=new AirplaneFactory();
        for(int i=0;i<5;i++){
            factory.create(screenWidth).show();
        }
        System.out.println("抵达");
        factory= new BossFactory();
        factory.create(screenWidth).show();
```

以后若需要加入新的类，只需要增加相应的工厂类，无需更改现有代码。
工厂方法模式中分类了产品，也分类了工厂。把生产方式放在具体的子类工厂中实现，抽象化，多态化。避免新加入一个产品类而反复修改同一个工厂类。
而简单工程类只是把生产方式堆积在简单工厂类中。

### 角色
