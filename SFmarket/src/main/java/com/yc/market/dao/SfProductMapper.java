package com.yc.market.dao;

import com.yc.market.bean.SfProduct;
import com.yc.market.bean.SfProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfProductMapper {
    long countByExample(SfProductExample example);

    int deleteByExample(SfProductExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(SfProduct record);

    int insertSelective(SfProduct record);

    List<SfProduct> selectByExample(SfProductExample example);

    SfProduct selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") SfProduct record, @Param("example") SfProductExample example);

    int updateByExample(@Param("record") SfProduct record, @Param("example") SfProductExample example);

    int updateByPrimaryKeySelective(SfProduct record);

    int updateByPrimaryKey(SfProduct record);
}