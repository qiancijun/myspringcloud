package com.qiancijun.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper {
    Integer decrease(@Param("cid") int cid, @Param("count") int count);
}
