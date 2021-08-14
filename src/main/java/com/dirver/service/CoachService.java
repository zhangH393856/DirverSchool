package com.dirver.service;

import com.dirver.mapper.CoachTableMapper;
import com.dirver.pojo.CoachTable;
import com.dirver.pojo.CoachTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: CoachService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 9:51 2021/8/16
 * @Version 1.0
 **/
@Service
public class CoachService {
    @Autowired
    CoachTableMapper coachTableMapper;
    //根据条件查询(车型||教练姓名)
    public List<CoachTable> coachAll(String carType,String coachName){
        CoachTableExample coachTableExample=new CoachTableExample();
        if (carType==null&&coachName==null){
            return   coachTableMapper.selectByExample(null);
        }else if (carType!=null&&coachName!=null){
            coachTableExample.createCriteria().andCoachCartypeEqualTo(carType).andCoachNameLike("%"+coachName+"%");
            return  coachTableMapper.selectByExample(coachTableExample);
        }else if (carType!=null){
            coachTableExample.createCriteria().andCoachCartypeEqualTo(carType);
            return  coachTableMapper.selectByExample(coachTableExample);
        }else {
            coachTableExample.createCriteria().andCoachNameLike("%"+coachName+"%");
            return  coachTableMapper.selectByExample(coachTableExample);
        }

    }
}
