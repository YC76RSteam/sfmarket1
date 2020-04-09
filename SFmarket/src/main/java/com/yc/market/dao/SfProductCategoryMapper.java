package com.yc.market.dao;

import com.yc.market.bean.SfProductCategory;
import com.yc.market.bean.SfProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfProductCategoryMapper {
    long countByExample(SfProductCategoryExample example);

    int deleteByExample(SfProductCategoryExample example);

    int deleteByPrimaryKey(Integer pcid);

    int insert(SfProductCategory record);

    int insertSelective(SfProductCategory record);

    List<SfProductCategory> selectByExample(SfProductCategoryExample example);

    SfProductCategory selectByPrimaryKey(Integer pcid);

    int updateByExampleSelective(@Param("record") SfProductCategory record, @Param("example") SfProductCategoryExample example);

    int updateByExample(@Param("record") SfProductCategory record, @Param("example") SfProductCategoryExample example);

    int updateByPrimaryKeySelective(SfProductCategory record);

    int updateByPrimaryKey(SfProductCategory record);
}