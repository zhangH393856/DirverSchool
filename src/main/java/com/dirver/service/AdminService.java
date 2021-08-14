package com.dirver.service;

import com.dirver.mapper.AccountTableMapper;
import com.dirver.mapper.DirveradminTableMapper;
import com.dirver.mapper.DirveruserTableMapper;
import com.dirver.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AdminService
 * @Description: TODO
 * @Author: lenovo
 * @Date: 9:42 2021/8/16
 * @Version 1.0
 **/
@Service
public class AdminService {
    @Autowired
    DirveradminTableMapper dirveradminTableMapper;
    @Autowired
    AccountTableMapper accountTableMapper;
    @Autowired
    DirveruserTableMapper dirveruserTableMapper;

    //登录验证
    public List<DirveradminTable> loginAdmin(String name, String password){
        DirveradminTableExample dirveradminTableExample=new DirveradminTableExample();
        dirveradminTableExample.createCriteria().andAdminNameEqualTo(name).andAdminPasswordEqualTo(password);
        return dirveradminTableMapper.selectByExample(dirveradminTableExample);
    }
    //用户驾照申请（预约报名,为申请用户分配账号）
    public int updateDirverUser(String userID, String loginName,String loginPwd){
        AccountTableExample accountTableExample=new AccountTableExample();
        accountTableExample.createCriteria().andAccountNameEqualTo(loginName).andAccountNameEqualTo(loginPwd);
        List<AccountTable> accountTables = accountTableMapper.selectByExample(accountTableExample);
        AccountTable accountTable=accountTables.get(0);
        accountTable.setAccountState(1);
        DirveruserTableExample dirveruserTableExample=new DirveruserTableExample();
        dirveruserTableExample.createCriteria().andUserIdEqualTo(userID);
        List<DirveruserTable> dirveruserTables = dirveruserTableMapper.selectByExample(dirveruserTableExample);
        DirveruserTable dirveruserTable=dirveruserTables.get(0);
        dirveruserTable.setUserLoginname(loginName);
        dirveruserTable.setUserLoginpwd(loginPwd);
        dirveruserTableMapper.updateByPrimaryKeySelective(dirveruserTable);
        accountTableMapper.updateByPrimaryKeySelective(accountTable);
        return 1;
    }
    //查询用户报考车型名单详情
    public List<DirveruserTable> userCarTypeAll(String name,String carType){
        DirveruserTableExample dirveruserTableExample=new DirveruserTableExample();
        if (name!=null){
            dirveruserTableExample.createCriteria().andUserNameEqualTo(name);
            List<DirveruserTable> dirveruserTables = dirveruserTableMapper.selectByExample(dirveruserTableExample);
            if (dirveruserTables.size()>0){

            }
        }
        dirveruserTableExample.createCriteria().andUserCartypeEqualTo(carType);
     return    dirveruserTableMapper.selectByExample(dirveruserTableExample);

    }
    //用户考试预约申请（受理时需发布本次考试的费用给用户）
    //考试信息公布（根据级别A1，A2，A3,B1,B2,C1,C2,C3查询）
    //考试费缴纳（拿本之前必须缴纳所有费用）
    //考试项目设置（科一，科二，科三，科四）
    //教练人员名单详情（根据级别A1，A2，A3,B1,B2,C1,C2,C3查询）
    //考生考完项目评分（判定用户项目是否合格，为合格则发布信息让用户重新考试（未合格用户可进行第二次考试考试，直接给予该用户办理（需要用户预约（立即办理，无需等待））））
    //公告发布（增删改查）
    //用户拿本（若用户缴纳完所有考试费用才可办理驾驶证）
    //拿本用户记录
}
