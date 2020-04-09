package com.yc.market.dao;

import com.yc.market.bean.SfOrderDetail;
import com.yc.market.bean.SfOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfOrderDetailMapper {
    long countByExample(SfOrderDetailExample example);

    int deleteByExample(SfOrderDetailExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(SfOrderDetail record);

    int insertSelective(SfOrderDetail record);

    List<SfOrderDetail> selectByExample(SfOrderDetailExample example);

    SfOrderDetail selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("record") SfOrderDetail record, @Param("example") SfOrderDetailExample example);

    int updateByExample(@Param("record") SfOrderDetail record, @Param("example") SfOrderDetailExample example);

    int updateByPrimaryKeySelective(SfOrderDetail record);

    int updateByPrimaryKey(SfOrderDetail record);
}