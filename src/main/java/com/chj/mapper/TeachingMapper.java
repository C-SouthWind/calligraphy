package com.chj.mapper;

import com.chj.model.Teaching;

import java.util.List;

public interface TeachingMapper {
    int deleteByPrimaryKey(Integer teachingId);

    int insert(Teaching record);

    Teaching selectByPrimaryKey(Integer teachingId);

    List<Teaching> selectAll();

    int updateByPrimaryKey(Teaching record);
}