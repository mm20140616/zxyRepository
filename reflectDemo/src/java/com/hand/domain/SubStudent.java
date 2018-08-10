package com.hand.domain;

/**
 * @ProjectName reflectDemo
 * @ClassName SubStudent
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/9 15:30
 * @Version 1.0
 **/
public class SubStudent extends Student {

    private String score = "100";

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
