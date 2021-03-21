package com.qiancijun.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
    Integer update(@Param("uid") int uid, @Param("money") int money);
}
