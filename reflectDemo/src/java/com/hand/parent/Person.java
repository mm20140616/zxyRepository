package com.hand.parent;

/**
 * @ProjectName reflectDemo
 * @ClassName Person
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/9 15:25
 * @Version 1.0
 **/
public class Person {
    private String name ="小明";
    private Integer age;
    private String sex = "男";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
