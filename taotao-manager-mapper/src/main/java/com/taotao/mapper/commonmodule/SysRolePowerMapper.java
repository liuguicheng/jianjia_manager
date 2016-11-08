package com.taotao.mapper.commonmodule;

import com.taotao.pojo.commonmodule.SysRolePower;
import com.taotao.pojo.commonmodule.SysRolePowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePowerMapper {
    int countByExample(SysRolePowerExample example);

    int deleteByExample(SysRolePowerExample example);

    int insert(SysRolePower record);

    int insertSelective(SysRolePower record);

    List<SysRolePower> selectByExample(SysRolePowerExample example);

    int updateByExampleSelective(@Param("record") SysRolePower record, @Param("example") SysRolePowerExample example);

    int updateByExample(@Param("record") SysRolePower record, @Param("example") SysRolePowerExample example);
}