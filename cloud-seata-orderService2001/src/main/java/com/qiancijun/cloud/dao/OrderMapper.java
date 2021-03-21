package com.qiancijun.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    Integer insertOrder(@Param("userId") int userid, @Param("commodityId") int cId, @Param("count") int count, @Param("money") int money);
    Integer updateOrder(@Param("userId") int userId);
}
