package org.wzp.hrm.mapper;

import org.wzp.hrm.domain.NoticeInf;

public interface NoticeInfMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeInf record);

    int insertSelective(NoticeInf record);

    

    NoticeInf selectByPrimaryKey(Integer id);

   

    int updateByPrimaryKeySelective(NoticeInf record);

    int updateByPrimaryKeyWithBLOBs(NoticeInf record);

    int updateByPrimaryKey(NoticeInf record);
}