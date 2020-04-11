package com.chj.service;

import com.chj.mapper.StateeMapper;
import com.chj.model.Statee;
import com.chj.model.Students;
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
 * @date ：Created in 2020/4/11 15:37
 * @params :
 */
@Service
public class StateeService {
    @Autowired
    private StateeMapper stateeMapper;
    /** 方法描述
    * @Description:
     *           [{text: '2016-05-01', value: '2016-05-01'},
     *            {text: '2016-05-02', value: '2016-05-02'},
     *            {text: '2016-05-03', value: '2016-05-03'},
     *            {text: '2016-05-04', value: '2016-05-04'}]
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap selectAllStateeName(){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        List<Statee> statees = stateeMapper.selectAll();
        if (IsNullEmpty.listIsNullEmpty(statees)) {
           for(Statee statee :statees){
               ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
               map.put("text",statee.getStateName());
               map.put("value",statee.getStateName());
               list.add(map);
           }
            return new ResultMap("20003","查询成功",list);
        }
        return new ResultMap("40003","查询失败",null);
    }
    /** 方法描述 
    * @Description: 查询所有状态
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap selectAll(){
        List<Statee> statees = stateeMapper.selectAll();
        if (IsNullEmpty.listIsNullEmpty(statees)) {
            return new ResultMap("20010","查询成功",statees);
        }
        return new ResultMap("40010","查询失败",null);
    }
}
