package com.dirver.mapper;

import com.dirver.pojo.AccountTable;
import com.dirver.pojo.AccountTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountTableMapper {
    int countByExample(AccountTableExample example);

    int deleteByExample(AccountTableExample example);

    int deleteByPrimaryKey(Integer accountId);

    int insert(AccountTable record);

    int insertSelective(AccountTable record);

    List<AccountTable> selectByExample(AccountTableExample example);

    AccountTable selectByPrimaryKey(Integer accountId);

    int updateByExampleSelective(@Param("record") AccountTable record, @Param("example") AccountTableExample example);

    int updateByExample(@Param("record") AccountTable record, @Param("example") AccountTableExample example);

    int updateByPrimaryKeySelective(AccountTable record);

    int updateByPrimaryKey(AccountTable record);
}