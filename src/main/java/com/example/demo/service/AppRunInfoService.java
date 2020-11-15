package com.example.demo.service;

import com.example.demo.pojo.AppRunInfo;

/**
 * @author lzb
 * 2020/11/15
 */
public interface AppRunInfoService {
    AppRunInfo FindAppRunInfoByUid(long uid);

    String predit();
}
