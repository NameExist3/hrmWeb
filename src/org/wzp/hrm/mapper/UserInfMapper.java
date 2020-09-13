package org.wzp.hrm.mapper;

import org.wzp.hrm.domain.User;

public interface UserInfMapper {
    
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    

    User selectByPrimaryKey(Integer id);

    

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}