package com.dirver.mapper;

import com.dirver.pojo.DirveradminTable;
import com.dirver.pojo.DirveradminTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirveradminTableMapper {
    int countByExample(DirveradminTableExample example);

    int deleteByExample(DirveradminTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DirveradminTable record);

    int insertSelective(DirveradminTable record);

    List<DirveradminTable> selectByExample(DirveradminTableExample example);

    DirveradminTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DirveradminTable record, @Param("example") DirveradminTableExample example);

    int updateByExample(@Param("record") DirveradminTable record, @Param("example") DirveradminTableExample example);

    int updateByPrimaryKeySelective(DirveradminTable record);

    int updateByPrimaryKey(DirveradminTable record);
}