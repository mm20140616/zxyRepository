package com.hand.mainpackage;

import com.hand.factory.AbstractFactory;
import com.hand.factory.IntelFactory;

/**
 * @ProjectName design_mode
 * @ClassName Client
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/7 18:38
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ComputerEngineer ce = new ComputerEngineer();
        AbstractFactory af = new IntelFactory();
        ce.makeComputer(af);
    }
}
