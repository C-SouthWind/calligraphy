package com.chj.service;

import com.chj.mapper.StudentsMapper;
import com.chj.model.Students;
import com.chj.model.StudentsVo;
import com.chj.util.IsNullEmpty;
import com.chj.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 10:13
 * @params :
 */
@Service
public class StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    /** 方法描述 
    * @Description: 查询学生信息
    * @Param: []
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap studentsVoAll(){
        List<StudentsVo> studentsVos = null;
        studentsVos = studentsMapper.studentsVoAll();
        if (IsNullEmpty.listIsNullEmpty(studentsVos)) {
            return new ResultMap("20000","查询成功",studentsVos);
        }
        return new ResultMap("40000","查询失败",null);
    }

    /** 方法描述
     * @Description: 根据实体新增数据
     * @Param: [record]
     * @return: com.chj.util.ResultMap
     * @Author: chj
     * @Date: 2020/4/11
     */
    public ResultMap insert(Students record){
        int insert = studentsMapper.insert(record);
        if (IsNullEmpty.intIsNullEmpty(insert)) {
            return new ResultMap("20006","添加成功",null);
        }
        return new ResultMap("40006","添加失败",null);
    }
    /** 方法描述
    * @Description: 根据id删除学生
    * @Param: [studentsId]
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
    public ResultMap deleteById(Integer studentsId){
        int i = studentsMapper.deleteById(studentsId);
        if (IsNullEmpty.intIsNullEmpty(i)) {
            return new ResultMap("20007","删除成功",i);
        }
        return new ResultMap("40007","删除失败",null);
    }
    /** 方法描述 
    * @Description: 根据ID查询某个学生
    * @Param: [studentsId]
    * @return: com.chj.util.ResultMap
    * @Author: chj
    * @Date: 2020/4/11
    */
   public ResultMap selectByPrimaryKey(Integer studentsId){
       Students students = studentsMapper.selectByPrimaryKey(studentsId);
       if (IsNullEmpty.objectIsNullEmpty(students)) {
           return new ResultMap("20008","查询成功",students);
       }
       return new ResultMap("40008","查询失败",null);
   }
   /** 方法描述
   * @Description: 根据实体修改
   * @Param: [record]
   * @return: int
   * @Author: com.chj.util.ResultMap
   * @Date: 2020/4/11
   */
    public ResultMap updateByPrimaryKey(Students record){
        int i = studentsMapper.updateByPrimaryKey(record);
        if (IsNullEmpty.intIsNullEmpty(i)) {
            return new ResultMap("20009","修改成功",i);
        }
        return new ResultMap("40009","修改失败",null);
    }

}
