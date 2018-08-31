package com.eric.dao;

import com.eric.bean.UserCopy;

public interface UserCopyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCopy record);

    int insertSelective(UserCopy record);

    UserCopy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCopy record);

    int updateByPrimaryKey(UserCopy record);
}