package com.taotao.mapper.commonmodule;

import com.taotao.pojo.commonmodule.SysStaffRoleRel;
import com.taotao.pojo.commonmodule.SysStaffRoleRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffRoleRelMapper {
    int countByExample(SysStaffRoleRelExample example);

    int deleteByExample(SysStaffRoleRelExample example);

    int insert(SysStaffRoleRel record);

    int insertSelective(SysStaffRoleRel record);

    List<SysStaffRoleRel> selectByExample(SysStaffRoleRelExample example);

    int updateByExampleSelective(@Param("record") SysStaffRoleRel record, @Param("example") SysStaffRoleRelExample example);

    int updateByExample(@Param("record") SysStaffRoleRel record, @Param("example") SysStaffRoleRelExample example);
}