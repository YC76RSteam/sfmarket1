package com.yc.market.dao;

import com.yc.market.bean.SfUserAddress;
import com.yc.market.bean.SfUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SfUserAddressMapper {
    long countByExample(SfUserAddressExample example);

    int deleteByExample(SfUserAddressExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(SfUserAddress record);

    int insertSelective(SfUserAddress record);

    List<SfUserAddress> selectByExample(SfUserAddressExample example);

    SfUserAddress selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") SfUserAddress record, @Param("example") SfUserAddressExample example);

    int updateByExample(@Param("record") SfUserAddress record, @Param("example") SfUserAddressExample example);

    int updateByPrimaryKeySelective(SfUserAddress record);

    int updateByPrimaryKey(SfUserAddress record);
}