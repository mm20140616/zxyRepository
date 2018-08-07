package com.hand;

/**
 * 饿汉单例，优点：基于classloder避免多线程问题，缺点：一台机器有多个classloder或者集群架构不适用
 *
 * @ProjectName design_mode
 * @ClassName HungerSingleton
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 16:14
 * @Version 1.0
 **/
public class HungerSingleton {
    /**
     * 功能描述 1.类加载时直接实例化 2.无参构造器私有化 3.公共方法获取实例。
     * @Author zhaoxiaoyu
     * @Date 2018/8/7 16:16
     **/
    private static HungerSingleton hungerSingleton = new HungerSingleton();
    private HungerSingleton () {}
    public HungerSingleton getHungerSingleton () {
        return hungerSingleton;
    }
}
