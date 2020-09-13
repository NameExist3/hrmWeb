package org.wzp.hrm.mapper;

import org.wzp.hrm.domain.Dept;

public interface DeptInfMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);


    Dept selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}