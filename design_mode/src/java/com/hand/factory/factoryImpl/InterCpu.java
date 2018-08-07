package com.hand.factory.factoryImpl;

import com.hand.factory.Cpu;

/**
 * @ProjectName design_mode
 * @ClassName InterCpu
 * @Description TODO 英特尔cpu
 * @Author 赵晓宇
 * @Date 2018/8/7 17:01
 * @Version 1.0
 **/
public class InterCpu implements Cpu {
    /**
     * cpu针脚数
     */
    private int pins = 0;
    public InterCpu (int pins) {
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
