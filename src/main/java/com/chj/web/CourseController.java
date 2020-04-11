package com.chj.web;

import com.chj.service.CourseService;
import com.chj.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 14:30
 * @params :
 */
@RequestMapping("/course")
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/selectAllCourseName")
    public ResultMap selectAllCourseName(){
        return courseService.selectAllCourseName();
    }
    @PostMapping("/selectAllName")
    public ResultMap selectAllName(){
        return courseService.selectAllName();
    }
}
