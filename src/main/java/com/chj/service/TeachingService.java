package com.chj.service;

import com.chj.mapper.TeachingMapper;
import com.chj.model.Teaching;
import com.chj.util.IsNullEmpty;
import com.chj.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 15:18
 * @params :
 */
@Service
public class TeachingService {
    @Autowired
    private TeachingMapper teachingMapper;
    /** 方法描述
    * @Description:
     *          拿到   [{text: '2016-05-01', value: '2016-05-01'},
     *                  {text: '2016-05-02', value: '2016-05-02'},
     *                  {text: '2016-05-03', value: '2016-05-03'},
     *                  {text: '2016-05-04', value: '2016-05-04'}]
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap selectAllTeachingName(){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        List<Teaching> teachings = teachingMapper.selectAll();
        if (IsNullEmpty.listIsNullEmpty(teachings)) {
            for(Teaching teaching :teachings){
                Map<String, String> map = new ConcurrentHashMap<String, String>();
                map.put("text",teaching.getTeachingTime());
                map.put("value",teaching.getTeachingTime());
                list.add(map);
            }
            return new ResultMap("20002","查询成功",list);
        }
        return new ResultMap("40002","查询失败",null);
    }
    /** 方法描述 
    * @Description: 查询上课时间
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap selectAllTime(){
        List<Teaching> teachings = teachingMapper.selectAll();
        if (IsNullEmpty.listIsNullEmpty(teachings)) {
            return new ResultMap("20005","查询成功",teachings);
        }
        return new ResultMap("40005","查询失败",null);
    }
}
