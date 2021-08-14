package com.dirver.mapper;

import com.dirver.pojo.ExamtypeTable;
import com.dirver.pojo.ExamtypeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamtypeTableMapper {
    int countByExample(ExamtypeTableExample example);

    int deleteByExample(ExamtypeTableExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(ExamtypeTable record);

    int insertSelective(ExamtypeTable record);

    List<ExamtypeTable> selectByExample(ExamtypeTableExample example);

    ExamtypeTable selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") ExamtypeTable record, @Param("example") ExamtypeTableExample example);

    int updateByExample(@Param("record") ExamtypeTable record, @Param("example") ExamtypeTableExample example);

    int updateByPrimaryKeySelective(ExamtypeTable record);

    int updateByPrimaryKey(ExamtypeTable record);
}