package com.chj.mapper;

import com.chj.model.Statee;

import java.util.List;

public interface StateeMapper {
    int deleteByPrimaryKey(Integer stateId);

    int insert(Statee record);

    Statee selectByPrimaryKey(Integer stateId);

    List<Statee> selectAll();

    int updateByPrimaryKey(Statee record);
}