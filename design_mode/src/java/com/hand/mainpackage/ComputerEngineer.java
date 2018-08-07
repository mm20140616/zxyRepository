package com.hand.mainpackage;

import com.hand.factory.AbstractFactory;
import com.hand.factory.Cpu;
import com.hand.factory.Mainboard;

/**
 * @ProjectName design_mode
 * @ClassName ComputerEngineer
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 18:33
 * @Version 1.0
 **/
public class ComputerEngineer {

    private Cpu cpu = null;
    private Mainboard mainboard = null;
    public void makeComputer (AbstractFactory af) {

        prepareHardWares(af);
    }
    public void prepareHardWares(AbstractFactory af){
        this.cpu = af.createCPU();
        this.mainboard = af.createMainboard();
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
