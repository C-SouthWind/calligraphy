package com.chj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 10:38
 * @params :
 */
@Controller
public class JumpController {

    @GetMapping("/index")
    public String calligraphy(){
        return "calligraphy";
    }
}
