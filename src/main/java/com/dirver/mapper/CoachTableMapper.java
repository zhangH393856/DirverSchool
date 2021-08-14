package com.dirver.mapper;

import com.dirver.pojo.CoachTable;
import com.dirver.pojo.CoachTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoachTableMapper {
    int countByExample(CoachTableExample example);

    int deleteByExample(CoachTableExample example);

    int deleteByPrimaryKey(Integer coachId);

    int insert(CoachTable record);

    int insertSelective(CoachTable record);

    List<CoachTable> selectByExample(CoachTableExample example);

    CoachTable selectByPrimaryKey(Integer coachId);

    int updateByExampleSelective(@Param("record") CoachTable record, @Param("example") CoachTableExample example);

    int updateByExample(@Param("record") CoachTable record, @Param("example") CoachTableExample example);

    int updateByPrimaryKeySelective(CoachTable record);

    int updateByPrimaryKey(CoachTable record);
}