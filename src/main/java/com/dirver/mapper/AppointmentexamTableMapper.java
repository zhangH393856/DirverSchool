package com.dirver.mapper;

import com.dirver.pojo.AppointmentexamTable;
import com.dirver.pojo.AppointmentexamTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentexamTableMapper {
    int countByExample(AppointmentexamTableExample example);

    int deleteByExample(AppointmentexamTableExample example);

    int deleteByPrimaryKey(Integer appointmentId);

    int insert(AppointmentexamTable record);

    int insertSelective(AppointmentexamTable record);

    List<AppointmentexamTable> selectByExample(AppointmentexamTableExample example);

    AppointmentexamTable selectByPrimaryKey(Integer appointmentId);

    int updateByExampleSelective(@Param("record") AppointmentexamTable record, @Param("example") AppointmentexamTableExample example);

    int updateByExample(@Param("record") AppointmentexamTable record, @Param("example") AppointmentexamTableExample example);

    int updateByPrimaryKeySelective(AppointmentexamTable record);

    int updateByPrimaryKey(AppointmentexamTable record);
}