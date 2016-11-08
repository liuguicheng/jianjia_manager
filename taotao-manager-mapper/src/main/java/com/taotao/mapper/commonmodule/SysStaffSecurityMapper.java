package com.taotao.mapper.commonmodule;

import com.taotao.pojo.commonmodule.SysStaffSecurity;
import com.taotao.pojo.commonmodule.SysStaffSecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffSecurityMapper {
    int countByExample(SysStaffSecurityExample example);

    int deleteByExample(SysStaffSecurityExample example);

    int deleteByPrimaryKey(String ssid);

    int insert(SysStaffSecurity record);

    int insertSelective(SysStaffSecurity record);

    List<SysStaffSecurity> selectByExample(SysStaffSecurityExample example);

    SysStaffSecurity selectByPrimaryKey(String ssid);

    int updateByExampleSelective(@Param("record") SysStaffSecurity record, @Param("example") SysStaffSecurityExample example);

    int updateByExample(@Param("record") SysStaffSecurity record, @Param("example") SysStaffSecurityExample example);

    int updateByPrimaryKeySelective(SysStaffSecurity record);

    int updateByPrimaryKey(SysStaffSecurity record);
}