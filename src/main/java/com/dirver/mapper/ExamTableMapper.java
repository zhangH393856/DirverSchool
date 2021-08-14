package com.dirver.mapper;

import com.dirver.pojo.ExamTable;
import com.dirver.pojo.ExamTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamTableMapper {
    int countByExample(ExamTableExample example);

    int deleteByExample(ExamTableExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(ExamTable record);

    int insertSelective(ExamTable record);

    List<ExamTable> selectByExample(ExamTableExample example);

    ExamTable selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") ExamTable record, @Param("example") ExamTableExample example);

    int updateByExample(@Param("record") ExamTable record, @Param("example") ExamTableExample example);

    int updateByPrimaryKeySelective(ExamTable record);

    int updateByPrimaryKey(ExamTable record);
}