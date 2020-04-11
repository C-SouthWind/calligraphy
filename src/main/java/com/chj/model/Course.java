package com.chj.model;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    /**
     * 课程编号
     */
    private Integer courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 冗余字段
     */
    private String courseRedundant;
    /**
     * 创建时间
     */
    private String courseCreationTime;
    /**
     * 修改时间
     */
    private String courseAmendTime;
    /**
     * 课程状态
     */
    private String courseState;

    public Course(Integer courseId, String courseName, String courseRedundant, String courseCreationTime, String courseAmendTime, String courseState) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseRedundant = courseRedundant;
        this.courseCreationTime = courseCreationTime;
        this.courseAmendTime = courseAmendTime;
        this.courseState = courseState;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseRedundant() {
        return courseRedundant;
    }

    public void setCourseRedundant(String courseRedundant) {
        this.courseRedundant = courseRedundant;
    }

    public String getCourseCreationTime() {
        return courseCreationTime;
    }

    public void setCourseCreationTime(String courseCreationTime) {
        this.courseCreationTime = courseCreationTime;
    }

    public String getCourseAmendTime() {
        return courseAmendTime;
    }

    public void setCourseAmendTime(String courseAmendTime) {
        this.courseAmendTime = courseAmendTime;
    }

    public String getCourseState() {
        return courseState;
    }

    public void setCourseState(String courseState) {
        this.courseState = courseState;
    }
}