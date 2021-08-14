package com.dirver.mapper;

import com.dirver.pojo.DirverlicenseTable;
import com.dirver.pojo.DirverlicenseTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirverlicenseTableMapper {
    int countByExample(DirverlicenseTableExample example);

    int deleteByExample(DirverlicenseTableExample example);

    int deleteByPrimaryKey(Integer licenseId);

    int insert(DirverlicenseTable record);

    int insertSelective(DirverlicenseTable record);

    List<DirverlicenseTable> selectByExample(DirverlicenseTableExample example);

    DirverlicenseTable selectByPrimaryKey(Integer licenseId);

    int updateByExampleSelective(@Param("record") DirverlicenseTable record, @Param("example") DirverlicenseTableExample example);

    int updateByExample(@Param("record") DirverlicenseTable record, @Param("example") DirverlicenseTableExample example);

    int updateByPrimaryKeySelective(DirverlicenseTable record);

    int updateByPrimaryKey(DirverlicenseTable record);
}