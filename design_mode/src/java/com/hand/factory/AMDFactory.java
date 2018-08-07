package com.hand.factory;

import com.hand.factory.factoryImpl.AMDCpu;
import com.hand.factory.factoryImpl.AMDMainboard;

/**
 * @ProjectName design_mode
 * @ClassName AMDFactory
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 19:24
 * @Version 1.0
 **/
public class AMDFactory implements AbstractFactory {
    @Override
    public Cpu createCPU() {
        return new AMDCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AMDMainboard(938);
    }
}
