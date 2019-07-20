package com.wah.kitty.labour.mapper;

import com.wah.kitty.labour.model.LabourJob;

public interface LabourJobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabourJob record);

    int insertSelective(LabourJob record);

    LabourJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabourJob record);

    int updateByPrimaryKey(LabourJob record);
}