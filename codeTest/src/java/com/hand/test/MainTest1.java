package com.hand.test;

import java.util.Scanner;

public class MainTest1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期(格式为yyyy-mm-dd)：");
        String str = sc.nextLine();
        String[] arrStr = str.split("-");
        try{
            int year = Integer.parseInt(arrStr[0]);
            int month = Integer.parseInt(arrStr[1]);
            int day = Integer.parseInt(arrStr[2]);
            int secondDay = 28;
            /**
             * 判断平年还是闰年
             */
            if ((year%4==0&&year%100!=0)||(year%400==0)) {
                //是闰年，2月29天
                secondDay = 29;
            }
            int nextDay=day+1;
            int[] months={31,secondDay,31,30,31,30,31,31,30,31,30,31};
            if (nextDay > months[month-1]) {
                month = month+1;
                day = 1;
                if (month>12) {
                    year = year+1;
                    month = 1;
                    System.out.println("下一天为：" + year+"-0"+month+"-0"+day);
                }
            }
            if (month<10 && nextDay<10) {
                System.out.println("下一天为：" + year+"-0"+month+"-0"+nextDay);
            }
            if (month<10 && nextDay>10) {
                System.out.println("下一天为：" + year+"-0"+month+"-"+nextDay);
            }
            if (month>10 && nextDay<10) {
                System.out.println("下一天为：" + year+"-"+month+"-0"+nextDay);
            }
            if (month>10 && nextDay>10) {
                System.out.println("下一天为：" + year+"-"+month+"-"+nextDay);
            }

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("输入的日期格式不正确");
        }catch (NumberFormatException e) {
            System.out.println("输入的日期不能为字母");
            e.printStackTrace();
        }


    }
}
