package org.wzp.hrm.mapper;

import org.wzp.hrm.domain.Job;

public interface JobInfMapper {
   
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

   

    Job selectByPrimaryKey(Integer id);

  

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}