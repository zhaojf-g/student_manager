package com.lon.personnelmanager.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.lon.personnelmanager.user.entity.User;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);
}