package com.chj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mysql.fabric.xmlrpc.base.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 9:45
 * @params :
 */
public class StudentsVo implements Serializable {
    /**
     * 学生编号
     */
    private Integer studentsId;
    /**
     * 学生姓名
     */
    private String studentsName;
    /**
     * 缴费数目
     */
    private Integer studentsMoney;
    /**
     * 课程时间
     */
    private String courseName;
    /**
     * 授课时间
     */
    private String teachingTime;
    /**
     * 家长电话
     */
    private String parentsTel;
    /**
     * 入班时间
     */
    private String startDate;
    /**
     * 学生状态
     */
    private String stateName;

    public StudentsVo(Integer studentsId, String studentsName, Integer studentsMoney, String courseName, String teachingTime, String parentsTel, String startDate, String stateName) {
        this.studentsId = studentsId;
        this.studentsName = studentsName;
        this.studentsMoney = studentsMoney;
        this.courseName = courseName;
        this.teachingTime = teachingTime;
        this.parentsTel = parentsTel;
        this.startDate = startDate;
        this.stateName = stateName;
    }

    public Integer getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(Integer studentsId) {
        this.studentsId = studentsId;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public Integer getStudentsMoney() {
        return studentsMoney;
    }

    public void setStudentsMoney(Integer studentsMoney) {
        this.studentsMoney = studentsMoney;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(String teachingTime) {
        this.teachingTime = teachingTime;
    }

    public String getParentsTel() {
        return parentsTel;
    }

    public void setParentsTel(String parentsTel) {
        this.parentsTel = parentsTel;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
