package com.example.demo.dao;

import com.example.demo.pojo.AppRunInfo;
import com.example.demo.pojo.AppRunInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppRunInfoMapper {
    long countByExample(AppRunInfoExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(AppRunInfo record);

    int insertSelective(AppRunInfo record);

    List<AppRunInfo> selectByExample(AppRunInfoExample example);

    AppRunInfo selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") AppRunInfo record, @Param("example") AppRunInfoExample example);

    int updateByExample(@Param("record") AppRunInfo record, @Param("example") AppRunInfoExample example);

    int updateByPrimaryKeySelective(AppRunInfo record);

    int updateByPrimaryKey(AppRunInfo record);
}