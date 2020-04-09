package com.yc.market.dao;

import com.yc.market.bean.SfUser;
import com.yc.market.bean.SfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfUserMapper {
    long countByExample(SfUserExample example);

    int deleteByExample(SfUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(SfUser record);

    int insertSelective(SfUser record);

    List<SfUser> selectByExample(SfUserExample example);

    SfUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") SfUser record, @Param("example") SfUserExample example);

    int updateByExample(@Param("record") SfUser record, @Param("example") SfUserExample example);

    int updateByPrimaryKeySelective(SfUser record);

    int updateByPrimaryKey(SfUser record);
}