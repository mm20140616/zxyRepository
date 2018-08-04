package com.hand.test;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入工资：");
        double salary = in.nextFloat(); //获取输入的工资金额
        double tax; //定义税费
        /**
         * 判断所需缴纳的税费
         * 工资排序：5000，8000，12500，38500，58500，83500
         */
        if (salary <=3500) {
            tax = 0;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary>3500 && salary <= 5000) {
            tax = (salary-3500) * 0.03;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary > 5000 && salary <= 8000) {
            tax = 1500 * 0.03 + (salary - 5000) * 0.1;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary > 8000 && salary <= 12500) {
            tax = 1500 * 0.03 + (8000-5000) * 0.1 + (salary - 8000) * 0.2;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary > 12500 && salary <= 38500) {
            tax = 1500 * 0.03 + (8000-5000) * 0.1 + (12500-8000) * 0.2 + (salary - 12500) * 0.25;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary > 38500 && salary <= 58500) {
            tax = 1500 * 0.03 + (8000-5000) * 0.1 + (12500-8000) * 0.2 + (38500-12500) * 0.25
                  + (salary-38500) * 0.3;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary > 58500 && salary <= 83500) {
            tax = 1500 * 0.03 + (8000-5000) * 0.1 + (12500-8000) * 0.2 + (38500-12500) * 0.25
                  + (58500-38500) * 0.3 + (salary-58500) * 0.35;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
        if (salary > 83500) {
            tax = 1500 * 0.03 + (8000-5000) * 0.1 + (12500-8000) * 0.2 + (38500-12500) * 0.25
                  + (58500-38500) * 0.3 + (salary-83500) * 0.35 + (salary-83500) * 0.45;
            System.out.println("所需要缴纳的税费为：" + tax);
        }
    }

}
