package com.yc.market.dao;

import com.yc.market.bean.SfShop;
import com.yc.market.bean.SfShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfShopMapper {
    long countByExample(SfShopExample example);

    int deleteByExample(SfShopExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(SfShop record);

    int insertSelective(SfShop record);

    List<SfShop> selectByExample(SfShopExample example);

    SfShop selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") SfShop record, @Param("example") SfShopExample example);

    int updateByExample(@Param("record") SfShop record, @Param("example") SfShopExample example);

    int updateByPrimaryKeySelective(SfShop record);

    int updateByPrimaryKey(SfShop record);
}