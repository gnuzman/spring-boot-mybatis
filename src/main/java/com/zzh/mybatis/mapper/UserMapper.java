package com.zzh.mybatis.mapper;

import com.zzh.mybatis.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    Long addUser(User user);
}
