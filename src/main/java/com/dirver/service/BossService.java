package com.dirver.service;

import com.dirver.mapper.ModelTableMapper;
import com.dirver.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: BossService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 11:15 2021/8/16
 * @Version 1.0
 **/
@Service
public class BossService {
    @Autowired
    DirveruserTableMapper dirveruserTableMapper;
    @Autowired
    ModelTableMapper modelTableMapper;
    //报考学员人数
    public int countUser(String carType){
        DirveruserTableExample dirveruserTableExample=new DirveruserTableExample();
        if (carType!=null){
            dirveruserTableExample.createCriteria().andUserCartypeEqualTo(carType);
          return   dirveruserTableMapper.countByExample(dirveruserTableExample);
        }else {
            return dirveruserTableMapper.countByExample(null);
        }
    }
    //计算驾校收入
    public  Double costAll(){
        List<DirveruserTable> dirveruserTables=dirveruserTableMapper.selectByExample(null);
        Double costs =0.0;
        for (DirveruserTable dirveruserTable: dirveruserTables) {
            Double userCost = dirveruserTable.getUserCost();
            costs+=userCost;
        }
        return costs;
    }
    //各类级别车型报考收费
    public int  updateModel(ModelTable modelTable){
        modelTable.setModelId(10001);
      return   modelTableMapper.updateByPrimaryKeySelective(modelTable);
    }
}
