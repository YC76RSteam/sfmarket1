package com.yc.market.dao;

import com.yc.market.bean.SfCart;
import com.yc.market.bean.SfCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfCartMapper {
    long countByExample(SfCartExample example);

    int deleteByExample(SfCartExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(SfCart record);

    int insertSelective(SfCart record);

    List<SfCart> selectByExample(SfCartExample example);

    SfCart selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") SfCart record, @Param("example") SfCartExample example);

    int updateByExample(@Param("record") SfCart record, @Param("example") SfCartExample example);

    int updateByPrimaryKeySelective(SfCart record);

    int updateByPrimaryKey(SfCart record);
}