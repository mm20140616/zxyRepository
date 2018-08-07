package com.hand;

/**
 * @ProjectName design_mode
 * @ClassName DoubleCheckingLocked
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 16:10
 * @Version 1.0
 **/
public class DoubleCheckingLocked {

    /**
     * 功能描述 volatile保证线程安全。
     * @Author zhaoxiaoyu
     * @Date 2018/8/7 16:11
     **/
    private volatile static DoubleCheckingLocked doubleCheckingLocked;
    private DoubleCheckingLocked () {}
    public static DoubleCheckingLocked getDoubleCheckingLocked () {
        if (doubleCheckingLocked == null) {
            synchronized(DoubleCheckingLocked.class) {
                doubleCheckingLocked = new DoubleCheckingLocked();
            }
        }
        return doubleCheckingLocked;
    }
}
