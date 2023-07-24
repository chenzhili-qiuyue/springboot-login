package com.ruanko.springboothelloworld.mapper;

import com.ruanko.springboothelloworld.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from login where user_name = #{userName}")
    public User selectUserByName(String userName);
}
