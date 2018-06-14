package com.bysj.zhongbao.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bysj.zhongbao.pojo.Bussiness;
import com.bysj.zhongbao.pojo.BussinessExample;
import com.bysj.zhongbao.pojo.TaskDetail;

@Repository
public interface BussinessMapper {
    int countByExample(BussinessExample example);

    int deleteByExample(BussinessExample example);

    int deleteByPrimaryKey(Integer bussinessid);
    //商家注册
    int insert(Bussiness record);
    //商家登陆
  	public Bussiness bussLogin(Bussiness buss);

    int insertSelective(Bussiness record);

    List<Bussiness> selectByExample(BussinessExample example);

    Bussiness selectByPrimaryKey(Integer bussinessid);

    int updateByExampleSelective(@Param("record") Bussiness record, @Param("example") BussinessExample example);

    int updateByExample(@Param("record") Bussiness record, @Param("example") BussinessExample example);

    int updateByPrimaryKeySelective(Bussiness record);
    //修改密码
    int updateByName(Bussiness record);
    
    List<Bussiness> getBussiness();
    
  //获取任务详细信息多表查询通过taskid
    TaskDetail getTaskDetail(Integer taskid);
    //任务详细信息的判断
    TaskDetail judgeDetail(Integer taskid);
 
}