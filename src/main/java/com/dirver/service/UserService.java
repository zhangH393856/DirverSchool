package com.dirver.service;

import com.dirver.mapper.DirveruserTableMapper;
import com.dirver.pojo.DirveruserTable;
import com.dirver.pojo.DirveruserTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 9:42 2021/8/16
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    DirveruserTableMapper dirveruserTableMapper;
    //登陆验证(该账号为管理员分配的帐户)
    public  List<DirveruserTable> loginUser(String loginname, String password){
        DirveruserTableExample dirveruserTableExample=new DirveruserTableExample();
        dirveruserTableExample.createCriteria().andUserNameEqualTo(loginname).andUserLoginpwdEqualTo(password);
      return   dirveruserTableMapper.selectByExample(dirveruserTableExample);
    }

    //驾校报名(预约)
    public int insertuser(DirveruserTable dirveruserTable){
    return dirveruserTableMapper.insert(dirveruserTable);
    }
    //教练预约（根据报考车型仅查询报考车型的教练及教练车）
    //考试预约（逐次预约考试，科一未考无法预约科二的考试，以此类推）
    //取消考试预约（删除本次预约记录）
    //考试结束系统打分（管理员评分，告诉用户本科考试是否合格，合格则可报考下一项，不合格则提醒用户需重新考试）
    //查看公告
    //个人考试信息查看（即考试记录）
    //拿本（考试项目全部考完并且所有项目合格才可拿本，拿本前需缴纳所有考试费用，否则不给发本，给予用户温馨提示）
    //驾驶证信息（车型 用户姓名  身份证号，手机号）
}
