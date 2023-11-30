package com.wang.openAi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.openAi.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
