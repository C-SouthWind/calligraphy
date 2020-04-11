package com.chj.service;

import com.chj.mapper.CourseMapper;
import com.chj.model.Course;
import com.chj.util.IsNullEmpty;
import com.chj.util.ResultMap;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 14:16
 * @params :
 */
@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
    /** 方法描述 
    * @Description: 查询所有课程时间
     *          拿到   [{text: '2016-05-01', value: '2016-05-01'},
     *                  {text: '2016-05-02', value: '2016-05-02'},
     *                  {text: '2016-05-03', value: '2016-05-03'},
     *                  {text: '2016-05-04', value: '2016-05-04'}]
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap selectAllCourseName(){
        List<Map<String,String>> CourseName = new ArrayList<Map<String,String>>();
        List<Course> courses = courseMapper.selectAll();
        if (IsNullEmpty.listIsNullEmpty(courses)) {
            for(Course course :courses){
                ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
                map.put("text",course.getCourseName());
                map.put("value",course.getCourseName());
                CourseName.add(map);
            }
            return new ResultMap("20001","查询成功",CourseName);
        }
        return new ResultMap("40001","查询失败",null);
    }
    /** 方法描述
    * @Description: 查询上课季度
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap selectAllName(){
        List<Course> courses = courseMapper.selectAll();
        if (IsNullEmpty.listIsNullEmpty(courses)) {
            return new ResultMap("20004","查询成功",courses);
        }
        return  new ResultMap("40004","查询失败",null);
    }
}
