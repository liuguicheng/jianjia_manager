package com.taotao.mapper.commonmodule;

import com.taotao.pojo.commonmodule.SysPower;
import com.taotao.pojo.commonmodule.SysPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPowerMapper {
    int countByExample(SysPowerExample example);

    int deleteByExample(SysPowerExample example);

    int deleteByPrimaryKey(String powerId);

    int insert(SysPower record);

    int insertSelective(SysPower record);

    List<SysPower> selectByExample(SysPowerExample example);

    SysPower selectByPrimaryKey(String powerId);

    int updateByExampleSelective(@Param("record") SysPower record, @Param("example") SysPowerExample example);

    int updateByExample(@Param("record") SysPower record, @Param("example") SysPowerExample example);

    int updateByPrimaryKeySelective(SysPower record);

    int updateByPrimaryKey(SysPower record);
}