package com.qiancijun.cloud.service;

import com.qiancijun.cloud.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-service-storage")
public interface StorageService {
    @PostMapping("/update/storage")
    CommonResult decrease(@RequestParam("cid") int cid, @RequestParam("count") int count);
}
