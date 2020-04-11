package com.chj.web;

import com.chj.service.StateeService;
import com.chj.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 15:51
 * @params :
 */
@RestController
@RequestMapping("/statee")
public class StateeController {
    @Autowired
    private StateeService stateeService;

    @PostMapping("/selectAllStateeName")
    public ResultMap selectAllStateeName(){
        return stateeService.selectAllStateeName();
    }
    @PostMapping("/selectAll")
    public ResultMap selectAll(){
        return stateeService.selectAll();
    }
}
