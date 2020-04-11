package com.chj.model;

import java.io.Serializable;
import java.util.Date;

public class Students implements Serializable {
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
    private Integer courseId;
    /**
     * 授课时间
     */
    private Integer teachingId;
    /**
     * 家长电话
     */
    private String parentsTel;
    /**
     * 入班时间
     */
    private String startDate;
    /**
     * 创建时间
     */
    private String studentsRedundant;
    /**
     * 修改时间
     */
    private String studentsAmendTime;
    /**
     * 学生状态
     */
    private String studentsState;

    private static final long serialVersionUID = 1L;

    public Students() {
    }

    public Students(Integer studentsId, String studentsName, Integer studentsMoney, Integer courseId, Integer teachingId, String parentsTel, String startDate, String studentsRedundant, String studentsAmendTime, String studentsState) {
        this.studentsId = studentsId;
        this.studentsName = studentsName;
        this.studentsMoney = studentsMoney;
        this.courseId = courseId;
        this.teachingId = teachingId;
        this.parentsTel = parentsTel;
        this.startDate = startDate;
        this.studentsRedundant = studentsRedundant;
        this.studentsAmendTime = studentsAmendTime;
        this.studentsState = studentsState;
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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeachingId() {
        return teachingId;
    }

    public void setTeachingId(Integer teachingId) {
        this.teachingId = teachingId;
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

    public String getStudentsRedundant() {
        return studentsRedundant;
    }

    public void setStudentsRedundant(String studentsRedundant) {
        this.studentsRedundant = studentsRedundant;
    }

    public String getStudentsAmendTime() {
        return studentsAmendTime;
    }

    public void setStudentsAmendTime(String studentsAmendTime) {
        this.studentsAmendTime = studentsAmendTime;
    }

    public String getStudentsState() {
        return studentsState;
    }

    public void setStudentsState(String studentsState) {
        this.studentsState = studentsState;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}