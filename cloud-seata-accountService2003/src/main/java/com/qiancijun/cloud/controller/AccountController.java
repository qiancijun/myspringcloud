package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.dao.AccountMapper;
import com.qiancijun.cloud.domain.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {
    @Resource
    private AccountMapper accountMapper;

    @PostMapping("/update/account")
    public CommonResult update(@RequestParam("uid") int uid, @RequestParam("money") int money) {
        Integer res = accountMapper.update(uid, money);
        if (res <= 0) {
            return new CommonResult(444, "出错了");
        }
        return new CommonResult(200, "成功修改账户余额", res);
    }

}
