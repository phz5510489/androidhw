package com.example.demo;

import com.example.demo.service.AppRunInfoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReceiveController {
    @Autowired
    private AppRunInfoService appRunInfoService;

    @RequestMapping(value = "/DataAdded",method = RequestMethod.POST)
    public ResponseEntity<String> DataAdded(@RequestBody String as){
        ObjectMapper mapper = new ObjectMapper();
        DataList dList = new DataList();
        dList.dataList = new DataNode[1024];

        String send2 = "{\"dataList\":[{\"appName\":\"qq\",\"packageName\":\"com.example.aa\",\"startStamp\":123456789,\"endStamp\":288927800,\"useStamp\":1288931400}, " +
                "{\"appName\":\"微信\",\"packageName\":\"com.example.bb\",\"startStamp\":456789789,\"endStamp\":1288933200,\"useStamp\":1288936800}]}";

        System.out.println("接收到消息:"+ as);

        try {
            dList = mapper.readValue(send2, DataList.class);
            for (var data : dList.dataList) {
                //数据存储

                System.out.println(data.toString());
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<String>(dList.toString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/predit",method = RequestMethod.GET)
    public ResponseEntity<String> predit() {
        String s = appRunInfoService.predit();
        return new ResponseEntity<String>(s, HttpStatus.OK);
    }
}