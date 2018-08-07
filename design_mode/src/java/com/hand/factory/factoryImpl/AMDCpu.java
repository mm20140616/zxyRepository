package com.hand.factory.factoryImpl;

import com.hand.factory.Cpu;

/**
 * @ProjectName design_mode
 * @ClassName AMDCpu
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 17:04
 * @Version 1.0
 **/
public class AMDCpu implements Cpu {

    private int pins = 0;
    public AMDCpu (int pins) {
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
