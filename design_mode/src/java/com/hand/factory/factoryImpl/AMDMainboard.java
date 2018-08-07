package com.hand.factory.factoryImpl;

import com.hand.factory.Mainboard;

/**
 * @ProjectName design_mode
 * @ClassName AMDMainboard
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 17:18
 * @Version 1.0
 **/
public class AMDMainboard implements Mainboard {
    private int cpuHoles = 0;
    public AMDMainboard (int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}
