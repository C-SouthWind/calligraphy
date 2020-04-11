package com.chj.web;

import com.chj.model.Students;
import com.chj.service.StudentsService;
import com.chj.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 10:36
 * @params :
 */
@RestController
@RequestMapping("/stu")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    /**
     * 查询所有学生信息
     * @return
     */
    @PostMapping("/studentsVoAll")
    public ResultMap studentsVoAll(){
        return studentsService.studentsVoAll();
    }

    @PostMapping("/insert")
    public ResultMap insert(Students record){
        return studentsService.insert(record);
    }
    @PostMapping("/deleteById")
    public ResultMap deleteById(Integer studentsId){
        return studentsService.deleteById(studentsId);
    }
    @PostMapping("/selectByPrimaryKey")
    public ResultMap selectByPrimaryKey(Integer studentsId){
        return studentsService.selectByPrimaryKey(studentsId);
    }
    @PostMapping("/updateByPrimaryKey")
    public ResultMap updateByPrimaryKey(Students record){
        return studentsService.updateByPrimaryKey(record);
    }

}
