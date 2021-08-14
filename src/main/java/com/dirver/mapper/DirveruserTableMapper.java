package com.dirver.mapper;

import com.dirver.pojo.DirveruserTable;
import com.dirver.pojo.DirveruserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirveruserTableMapper {
    int countByExample(DirveruserTableExample example);

    int deleteByExample(DirveruserTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DirveruserTable record);

    int insertSelective(DirveruserTable record);

    List<DirveruserTable> selectByExample(DirveruserTableExample example);

    DirveruserTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DirveruserTable record, @Param("example") DirveruserTableExample example);

    int updateByExample(@Param("record") DirveruserTable record, @Param("example") DirveruserTableExample example);

    int updateByPrimaryKeySelective(DirveruserTable record);

    int updateByPrimaryKey(DirveruserTable record);
}