package com.taotao.mapper.commonmodule;

import com.taotao.pojo.commonmodule.SysOperateLog;
import com.taotao.pojo.commonmodule.SysOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOperateLogMapper {
    int countByExample(SysOperateLogExample example);

    int deleteByExample(SysOperateLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysOperateLog record);

    int insertSelective(SysOperateLog record);

    List<SysOperateLog> selectByExample(SysOperateLogExample example);

    SysOperateLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysOperateLog record, @Param("example") SysOperateLogExample example);

    int updateByExample(@Param("record") SysOperateLog record, @Param("example") SysOperateLogExample example);

    int updateByPrimaryKeySelective(SysOperateLog record);

    int updateByPrimaryKey(SysOperateLog record);
}