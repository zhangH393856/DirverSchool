package com.dirver.mapper;

import com.dirver.pojo.SignupTable;
import com.dirver.pojo.SignupTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignupTableMapper {
    int countByExample(SignupTableExample example);

    int deleteByExample(SignupTableExample example);

    int deleteByPrimaryKey(Integer signupId);

    int insert(SignupTable record);

    int insertSelective(SignupTable record);

    List<SignupTable> selectByExample(SignupTableExample example);

    SignupTable selectByPrimaryKey(Integer signupId);

    int updateByExampleSelective(@Param("record") SignupTable record, @Param("example") SignupTableExample example);

    int updateByExample(@Param("record") SignupTable record, @Param("example") SignupTableExample example);

    int updateByPrimaryKeySelective(SignupTable record);

    int updateByPrimaryKey(SignupTable record);
}