package com.dirver.mapper;

import com.dirver.pojo.ModelTable;
import com.dirver.pojo.ModelTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelTableMapper {
    int countByExample(ModelTableExample example);

    int deleteByExample(ModelTableExample example);

    int deleteByPrimaryKey(Integer modelId);

    int insert(ModelTable record);

    int insertSelective(ModelTable record);

    List<ModelTable> selectByExample(ModelTableExample example);

    ModelTable selectByPrimaryKey(Integer modelId);

    int updateByExampleSelective(@Param("record") ModelTable record, @Param("example") ModelTableExample example);

    int updateByExample(@Param("record") ModelTable record, @Param("example") ModelTableExample example);

    int updateByPrimaryKeySelective(ModelTable record);

    int updateByPrimaryKey(ModelTable record);
}