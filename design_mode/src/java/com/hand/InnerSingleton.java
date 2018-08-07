package com.hand;

/**
 * @ProjectName design_mode
 * @ClassName InnerSingleton
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 16:22
 * @Version 1.0
 **/
public class InnerSingleton {
    /**
     * 功能描述 1.静态内部类初始化单例 2.无参构造器私有化 3.返回内部类的实例
     * @Author zhaoxiaoyu
     * @Date 2018/8/7 16:23
     **/
    private static class GetInnerSingleton {
        private static final InnerSingleton innerSingleton = new InnerSingleton();
    }
    private InnerSingleton () {}
    public static final InnerSingleton getInnerSingleton () {
        return GetInnerSingleton.innerSingleton;
    }

    
}
