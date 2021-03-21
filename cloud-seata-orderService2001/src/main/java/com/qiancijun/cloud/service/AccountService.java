package com.qiancijun.cloud.service;

import com.qiancijun.cloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping("/update/account")
    CommonResult update(@RequestParam("uid") int uid, @RequestParam("money") int money);
}
