package com.chj.model;

import java.io.Serializable;
import java.util.Date;

public class Teaching implements Serializable {
    /**
     * 授课时间ID
     */
    private Integer teachingId;
    /**
     * 授课时间
     */
    private String teachingTime;
    /**
     * 冗余字段
     */
    private String teachingTimeRedundant;
    /**
     * 创建时间
     */
    private String teachingTimeCreationTime;
    /**
     * 修改时间
     */
    private String teachingTimeAmendTime;
    /**
     * 授课状态
     */
    private String teachingTimeState;

    private static final long serialVersionUID = 1L;

    public Teaching(Integer teachingId, String teachingTime, String teachingTimeRedundant, String teachingTimeCreationTime, String teachingTimeAmendTime, String teachingTimeState) {
        this.teachingId = teachingId;
        this.teachingTime = teachingTime;
        this.teachingTimeRedundant = teachingTimeRedundant;
        this.teachingTimeCreationTime = teachingTimeCreationTime;
        this.teachingTimeAmendTime = teachingTimeAmendTime;
        this.teachingTimeState = teachingTimeState;
    }

    public Integer getTeachingId() {
        return teachingId;
    }

    public void setTeachingId(Integer teachingId) {
        this.teachingId = teachingId;
    }

    public String getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(String teachingTime) {
        this.teachingTime = teachingTime;
    }

    public String getTeachingTimeRedundant() {
        return teachingTimeRedundant;
    }

    public void setTeachingTimeRedundant(String teachingTimeRedundant) {
        this.teachingTimeRedundant = teachingTimeRedundant;
    }

    public String getTeachingTimeCreationTime() {
        return teachingTimeCreationTime;
    }

    public void setTeachingTimeCreationTime(String teachingTimeCreationTime) {
        this.teachingTimeCreationTime = teachingTimeCreationTime;
    }

    public String getTeachingTimeAmendTime() {
        return teachingTimeAmendTime;
    }

    public void setTeachingTimeAmendTime(String teachingTimeAmendTime) {
        this.teachingTimeAmendTime = teachingTimeAmendTime;
    }

    public String getTeachingTimeState() {
        return teachingTimeState;
    }

    public void setTeachingTimeState(String teachingTimeState) {
        this.teachingTimeState = teachingTimeState;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}