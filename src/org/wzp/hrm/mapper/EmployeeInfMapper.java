package org.wzp.hrm.mapper;

import org.wzp.hrm.domain.Employee;

public interface EmployeeInfMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    

    Employee selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}