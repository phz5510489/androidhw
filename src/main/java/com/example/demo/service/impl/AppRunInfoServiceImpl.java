package com.example.demo.service.impl;

import com.example.demo.dao.AppRunInfoMapper;
import com.example.demo.pojo.AppRunInfo;
import com.example.demo.pojo.AppRunInfoExample;
import com.example.demo.service.AppRunInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzb
 * 2020/11/15
 */
@Service
public class AppRunInfoServiceImpl implements AppRunInfoService {

    @Autowired
    private AppRunInfoMapper appRunInfoMapper;


    @Override
    public AppRunInfo FindAppRunInfoByUid(long uid) {
        return appRunInfoMapper.selectByPrimaryKey(uid);
    }


    @Override
    public String predit() {
        AppRunInfoExample example = new AppRunInfoExample();
        example.createCriteria();
        List<AppRunInfo> runInfos = appRunInfoMapper.selectByExample(example);
        System.out.println(runInfos.size());
        for(AppRunInfo info : runInfos) {
            System.out.println(info.getAppName() + "," +
                    info.getPackageName()+"");
        }
        return runInfos.get(0).getAppName();
    }
}
