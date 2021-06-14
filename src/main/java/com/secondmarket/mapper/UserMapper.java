package com.secondmarket.mapper;

import com.secondmarket.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {

    public User findUserByUserName(String username);
    public User findUserByUserPhone(String phone);

}
