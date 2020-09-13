package org.wzp.hrm.mapper;

import org.wzp.hrm.domain.DocumentInf;

public interface DocumentInfMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(DocumentInf record);

    int insertSelective(DocumentInf record);

    

    DocumentInf selectByPrimaryKey(Integer id);

   

    int updateByPrimaryKeySelective(DocumentInf record);

    int updateByPrimaryKey(DocumentInf record);
}