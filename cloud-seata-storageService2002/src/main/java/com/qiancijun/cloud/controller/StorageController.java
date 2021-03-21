package com.qiancijun.cloud.controller;

import com.qiancijun.cloud.dao.StorageMapper;
import com.qiancijun.cloud.domain.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageMapper storageMapper;

    @PostMapping("/update/storage")
    public CommonResult update(@RequestParam("cid") int cid, @RequestParam("count") int count) {
        Integer res = storageMapper.decrease(cid, count);
        if (res <= 0) {
            return new CommonResult(444, "失败");
        }
        return new CommonResult(200, "修改库存成功", res);
    }
}
