package com.hand.factory;

import com.hand.factory.factoryImpl.IntelMainboard;
import com.hand.factory.factoryImpl.InterCpu;

/**
 * @ProjectName design_mode
 * @ClassName IntelFactory
 * @Description TODO 抽象工厂
 * @Author 赵晓宇
 * @Date 2018/8/7 19:23
 * @Version 1.0
 **/
public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCPU() {

        return new InterCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
