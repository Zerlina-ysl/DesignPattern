## 静态代理
在RouterProxy中实现Internet方法，实例化Modem对象，调用Modem的方法，并织入功能。
Modem实现Internet的方法。
后续直接调用RouterProxy的方法，避免对Modem的调用。

## 动态代理
    动态完成实例化，不需要专门针对某个接口编写代码实现一个代理类，而是在接口运行时动态生成。
    对类以及方法都不需要在意，只需运行在构造方法中传入类型（Object，在invoke方法中提供代理方法。