package com.chj.mapper;

import com.chj.model.Students;
import com.chj.model.StudentsVo;

import java.util.List;

public interface StudentsMapper {
    int deleteByPrimaryKey(Integer studentsId);

    int insert(Students record);

    Students selectByPrimaryKey(Integer studentsId);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);

    List<StudentsVo> studentsVoAll();

    int deleteById(Integer studentsId);
}