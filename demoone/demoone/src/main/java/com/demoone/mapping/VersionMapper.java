package com.demoone.mapping;

import com.demoone.DTO.Version;

public interface VersionMapper {
    Version selectLastest();

    int deleteByPrimaryKey(Integer id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}