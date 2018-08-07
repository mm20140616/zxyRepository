package com.hand;


public class LazySingleton {
    /**
     * 功能描述 1.声明静态全局变量 2.无参构造器私有化 3.同步公共方法解决多线程问题来获取单例
     * @Author zhaoxiaoyu
     * @Date 2018/8/7 16:37
     **/
    private static LazySingleton lazySingleton;
    private LazySingleton(){}
    public static synchronized LazySingleton getLazySingleton () {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
