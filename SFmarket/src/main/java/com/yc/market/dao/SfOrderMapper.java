package com.yc.market.dao;

import com.yc.market.bean.SfOrder;
import com.yc.market.bean.SfOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfOrderMapper {
    long countByExample(SfOrderExample example);

    int deleteByExample(SfOrderExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(SfOrder record);

    int insertSelective(SfOrder record);

    List<SfOrder> selectByExample(SfOrderExample example);

    SfOrder selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") SfOrder record, @Param("example") SfOrderExample example);

    int updateByExample(@Param("record") SfOrder record, @Param("example") SfOrderExample example);

    int updateByPrimaryKeySelective(SfOrder record);

    int updateByPrimaryKey(SfOrder record);
}