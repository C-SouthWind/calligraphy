package com.chj.web;

import com.chj.service.TeachingService;
import com.chj.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 15:26
 * @params :
 */
@RestController
@RequestMapping("/teaching")
public class TeachingController {
    @Autowired
    private TeachingService teachingService;

    @PostMapping("/selectAllTeachingName")
    public ResultMap selectAllTeachingName(){
        return teachingService.selectAllTeachingName();
    }
    @PostMapping("/selectAllTime")
    public ResultMap selectAllTime(){
        return teachingService.selectAllTime();
    }
}
