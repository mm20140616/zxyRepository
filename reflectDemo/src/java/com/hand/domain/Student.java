package com.hand.domain;

import com.hand.parent.Person;

/**
 * @ProjectName reflectDemo
 * @ClassName Student
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/9 15:24
 * @Version 1.0
 **/
public class Student extends Person {

    private String studentName = "小明";
    private Integer grade = 7;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer classNumber) {
        this.grade = classNumber;
    }
}
