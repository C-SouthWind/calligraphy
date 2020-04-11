package com.chj.mapper;

import com.chj.model.Course;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    Course selectByPrimaryKey(Integer courseId);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);
}