package com.taotao.mapper.commonmodule;

import com.taotao.pojo.commonmodule.SysStaff;
import com.taotao.pojo.commonmodule.SysStaffExample;
import com.taotao.pojo.commonmodule.SysStaffKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffMapper {
    int countByExample(SysStaffExample example);

    int deleteByExample(SysStaffExample example);

    int deleteByPrimaryKey(SysStaffKey key);

    int insert(SysStaff record);

    int insertSelective(SysStaff record);

    List<SysStaff> selectByExample(SysStaffExample example);

    SysStaff selectByPrimaryKey(SysStaffKey key);

    int updateByExampleSelective(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByExample(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByPrimaryKeySelective(SysStaff record);

    int updateByPrimaryKey(SysStaff record);
}