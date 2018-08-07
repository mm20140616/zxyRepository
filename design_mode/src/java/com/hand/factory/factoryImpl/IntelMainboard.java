package com.hand.factory.factoryImpl;

import com.hand.factory.Mainboard;

/**
 * @ProjectName design_mode
 * @ClassName IntelMainboard
 * @Description TODO 英特尔主板实现类
 * @Author 赵晓宇
 * @Date 2018/8/7 17:15
 * @Version 1.0
 **/
public class IntelMainboard implements Mainboard {
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles
     */
    public IntelMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }
}
