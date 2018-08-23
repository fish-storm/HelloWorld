package com.demoone.DAO;

import com.demoone.DTO.Version;
import org.apache.ibatis.annotations.Select;

public interface VersionMapper {
    @Select("select id,main_version AS mainVersion," +
            "beta_version AS betaVersion,path,comm " +
            "from version ORDER by id DESC limit 1")
    Version selectLastest();

    int deleteByPrimaryKey(Integer id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}